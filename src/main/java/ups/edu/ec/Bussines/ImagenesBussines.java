package ups.edu.ec.Bussines;

import java.net.URI;

import javax.ejb.Stateless;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

@Stateless
public class ImagenesBussines {

	public String  buscarImagenes(String imagen) {
		
		String ListaImagenes = "";

		HttpClient httpclient = HttpClients.createDefault();

		try {
			URIBuilder builder = new URIBuilder("https://api.cognitive.microsoft.com/bing/v7.0/images/search");

			builder.setParameter("q", imagen);
			builder.setParameter("count", "10");
			builder.setParameter("offset", "0");
			builder.setParameter("Age", "8");
			builder.setParameter("mkt", "en-us");
			builder.setParameter("safeSearch", "Strict");

			URI uri = builder.build();
			HttpGet request = new HttpGet(uri);
			request.setHeader("Ocp-Apim-Subscription-Key", "1701f43d1bcd4c2980b94e9251acc481");

			HttpResponse response = httpclient.execute(request);
			// System.out.print(response.toString());
			HttpEntity entity = response.getEntity();

			if (entity != null)

			{
				System.out.println("Entities" + entity.getContent());
				String datos  = EntityUtils.toString(entity);				
				String[] resultadoSplit = datos.split("queryExpansions");				
				System.out.println("Primera parte= " + resultadoSplit[1]);
				String r = resultadoSplit[1].replace("[", "");
				r= r.replace("]","");
				String rs = r.replace(", \"thumbnail\": {\"thumbnailUrl\": \"","[");
				String rs1 =  rs.replace("\"}}", "]");		
				System.out.println(rs1);
				String[]pp = StringUtils.substringsBetween(rs1, "[", "]");
				System.out.println(pp.length);
				
				for (int i = 0; i < pp.length; i++) {		
					ListaImagenes = ListaImagenes +  pp[i] + "," ;	
				}
				System.out.println(ListaImagenes);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return ListaImagenes;
	}
	
	
}
