package com.bangkit.tanamoretest.scanTanaman;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0012\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J+\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016\u00a2\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u000fH\u0014J\b\u0010\u001f\u001a\u00020\u000fH\u0002J\b\u0010 \u001a\u00020\u000fH\u0002J\b\u0010!\u001a\u00020\u000fH\u0002J\u0012\u0010\"\u001a\u0004\u0018\u00010\u00122\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/bangkit/tanamoretest/scanTanaman/ScanTanamanActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "CAMERA_PERMISSION_REQUEST_CODE", "", "binding", "Lcom/bangkit/tanamoretest/databinding/ActivityScanTanamanBinding;", "galleryLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "imageCapture", "Landroidx/camera/core/ImageCapture;", "viewModel", "Lcom/bangkit/tanamoretest/scanTanaman/ScanTanamanViewModel;", "analyzeImage", "", "checkCameraPermission", "compressImage", "Ljava/io/File;", "file", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "openGallery", "setupCamera", "takePhoto", "uriToFile", "uri", "Landroid/net/Uri;", "app_debug"})
public final class ScanTanamanActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.bangkit.tanamoretest.databinding.ActivityScanTanamanBinding binding;
    private com.bangkit.tanamoretest.scanTanaman.ScanTanamanViewModel viewModel;
    private androidx.camera.core.ImageCapture imageCapture;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> galleryLauncher = null;
    private final int CAMERA_PERMISSION_REQUEST_CODE = 123;
    
    public ScanTanamanActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void checkCameraPermission() {
    }
    
    private final void setupCamera() {
    }
    
    private final void takePhoto() {
    }
    
    private final java.io.File compressImage(java.io.File file) {
        return null;
    }
    
    private final void openGallery() {
    }
    
    private final void analyzeImage() {
    }
    
    private final java.io.File uriToFile(android.net.Uri uri) {
        return null;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
}