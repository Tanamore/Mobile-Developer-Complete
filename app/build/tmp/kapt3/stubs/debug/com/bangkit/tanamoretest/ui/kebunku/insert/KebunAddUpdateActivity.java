package com.bangkit.tanamoretest.ui.kebunku.insert;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014H\u0002J\u0012\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\fH\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001a\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0001H\u0002J\u0012\u0010\u001f\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u001cH\u0014J\b\u0010#\u001a\u00020\u001cH\u0002J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u0014H\u0002J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020(H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/bangkit/tanamoretest/ui/kebunku/insert/KebunAddUpdateActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "_activityKebunAddUpdateBinding", "Lcom/bangkit/tanamoretest/databinding/ActivityKebunAddUpdateBinding;", "binding", "getBinding", "()Lcom/bangkit/tanamoretest/databinding/ActivityKebunAddUpdateBinding;", "getResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "imageUri", "Landroid/net/Uri;", "isEdit", "", "kebun", "Lcom/bangkit/tanamoretest/ui/kebunku/database/Kebun;", "kebunAddUpdateViewModel", "Lcom/bangkit/tanamoretest/ui/kebunku/insert/KebunAddUpdateViewModel;", "calculateInSampleSize", "", "options", "Landroid/graphics/BitmapFactory$Options;", "reqWidth", "reqHeight", "isValidImageSize", "uri", "loadImageFromUri", "", "obtainViewModel", "activity", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "openGallery", "showAlertDialog", "type", "showToast", "message", "", "Companion", "app_debug"})
public final class KebunAddUpdateActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_NOTE = "extra_note";
    public static final int ALERT_DIALOG_CLOSE = 10;
    public static final int REQUEST_CODE = 1001;
    public static final int MAX_IMAGE_SIZE_MB = 8;
    private boolean isEdit = false;
    @org.jetbrains.annotations.Nullable()
    private com.bangkit.tanamoretest.ui.kebunku.database.Kebun kebun;
    private com.bangkit.tanamoretest.ui.kebunku.insert.KebunAddUpdateViewModel kebunAddUpdateViewModel;
    @org.jetbrains.annotations.Nullable()
    private com.bangkit.tanamoretest.databinding.ActivityKebunAddUpdateBinding _activityKebunAddUpdateBinding;
    @org.jetbrains.annotations.Nullable()
    private android.net.Uri imageUri;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> getResultLauncher = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.bangkit.tanamoretest.ui.kebunku.insert.KebunAddUpdateActivity.Companion Companion = null;
    
    public KebunAddUpdateActivity() {
        super();
    }
    
    private final com.bangkit.tanamoretest.databinding.ActivityKebunAddUpdateBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final boolean isValidImageSize(android.net.Uri uri) {
        return false;
    }
    
    private final void loadImageFromUri(android.net.Uri uri) {
    }
    
    private final int calculateInSampleSize(android.graphics.BitmapFactory.Options options, int reqWidth, int reqHeight) {
        return 0;
    }
    
    private final void openGallery() {
    }
    
    private final void showToast(java.lang.String message) {
    }
    
    private final void showAlertDialog(int type) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final com.bangkit.tanamoretest.ui.kebunku.insert.KebunAddUpdateViewModel obtainViewModel(androidx.appcompat.app.AppCompatActivity activity) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/bangkit/tanamoretest/ui/kebunku/insert/KebunAddUpdateActivity$Companion;", "", "()V", "ALERT_DIALOG_CLOSE", "", "EXTRA_NOTE", "", "MAX_IMAGE_SIZE_MB", "REQUEST_CODE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}