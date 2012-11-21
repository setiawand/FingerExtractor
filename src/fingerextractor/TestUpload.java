package fingerextractor;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;

public class TestUpload {

    public static void main(String[] args)
            throws MalformedURLException, IOException {
        File file = new File("C:\\Users\\Deni Setiawan\\Documents\\NetBeansProjects\\FingerExtractor\\Januari_2012060431989.csv");
        HttpClient client = new HttpClient();
        GetMethod fileGet = new GetMethod("http://localhost/myhr/symfony/web/index.php/attendance/testUploadFileCsv");
        int result = client.executeMethod(fileGet);
        System.out.println(result);
        InputStream is = fileGet.getResponseBodyAsStream();
        BufferedReader in = new BufferedReader(new InputStreamReader(is));
        String line = "";
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
//        PostMethod filePost = new PostMethod("http://localhost/myhr/symfony/web/index.php/attendance/testUploadFileCsv");
//        Part[] parts = {new FilePart("data", file)};
//        filePost.setRequestEntity(new MultipartRequestEntity(parts, filePost.getParams()));
//        int result = client.executeMethod(filePost);
//        System.out.println(result);
//        InputStream is = filePost.getResponseBodyAsStream();
//        BufferedReader in = new BufferedReader(new InputStreamReader(is));
//
//        String line = "";
//        while ((line = in.readLine()) != null) {
//            System.out.println(line);
//        }

    }
}
