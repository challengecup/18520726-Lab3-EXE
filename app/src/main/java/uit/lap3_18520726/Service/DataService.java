package uit.lap3_18520726.Service;

import retrofit2.Call;
import retrofit2.http.GET;
import uit.lap3_18520726.Model.News;

public interface DataService {

    @GET("/v2/everything?q=apple&from=2022-04-29&to=2022-04-29&sortBy=popularity&apiKey=d9f20dfc50204b6cac20cccfeef1dbaa")
    Call<News> GetDataNews();

}
