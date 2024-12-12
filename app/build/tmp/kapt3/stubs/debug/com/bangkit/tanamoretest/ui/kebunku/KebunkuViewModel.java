package com.bangkit.tanamoretest.ui.kebunku;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/bangkit/tanamoretest/ui/kebunku/KebunkuViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "mKebunRepository", "Lcom/bangkit/tanamoretest/ui/kebunku/repositoryKebunku/KebunRepository;", "deleteKebun", "", "kebun", "Lcom/bangkit/tanamoretest/ui/kebunku/database/Kebun;", "getAllKebun", "Landroidx/lifecycle/LiveData;", "", "app_debug"})
public final class KebunkuViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.bangkit.tanamoretest.ui.kebunku.repositoryKebunku.KebunRepository mKebunRepository = null;
    
    public KebunkuViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.bangkit.tanamoretest.ui.kebunku.database.Kebun>> getAllKebun() {
        return null;
    }
    
    public final void deleteKebun(@org.jetbrains.annotations.NotNull()
    com.bangkit.tanamoretest.ui.kebunku.database.Kebun kebun) {
    }
}