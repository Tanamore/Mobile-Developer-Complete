package com.bangkit.tanamoretest.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0002\u0010\u0012\u00a8\u0006\u0015"}, d2 = {"Lcom/bangkit/tanamoretest/api/ApiService;", "", "getEnsiklopedia", "Lretrofit2/Response;", "Lcom/bangkit/tanamoretest/response/EnsiklopediaResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEnsiklopediaDetail", "Lcom/bangkit/tanamoretest/response/EnsiklopediaDetailResponse;", "plantId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchEnsiklopedia", "Lcom/bangkit/tanamoretest/response/SearchEnsiklopediaResponse;", "name", "uploadImage", "Lcom/bangkit/tanamoretest/response/DeteksiPenyakitResponse;", "image", "Lokhttp3/MultipartBody$Part;", "(Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadImageEnsiklopedia", "Lcom/bangkit/tanamoretest/response/PredictEnsiklopediaResponse;", "app_debug"})
public abstract interface ApiService {
    
    @retrofit2.http.Multipart()
    @retrofit2.http.POST(value = "diseases/predict")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object uploadImage(@retrofit2.http.Part()
    @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part image, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bangkit.tanamoretest.response.DeteksiPenyakitResponse>> $completion);
    
    @retrofit2.http.GET(value = "encyclopedias")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getEnsiklopedia(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bangkit.tanamoretest.response.EnsiklopediaResponse>> $completion);
    
    @retrofit2.http.GET(value = "encyclopedias/{plant_id}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getEnsiklopediaDetail(@retrofit2.http.Path(value = "plant_id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String plantId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bangkit.tanamoretest.response.EnsiklopediaDetailResponse>> $completion);
    
    @retrofit2.http.GET(value = "encyclopedias/search")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchEnsiklopedia(@retrofit2.http.Query(value = "name")
    @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bangkit.tanamoretest.response.SearchEnsiklopediaResponse>> $completion);
    
    @retrofit2.http.Multipart()
    @retrofit2.http.POST(value = "encyclopedias/predict")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object uploadImageEnsiklopedia(@retrofit2.http.Part()
    @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part image, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bangkit.tanamoretest.response.PredictEnsiklopediaResponse>> $completion);
}