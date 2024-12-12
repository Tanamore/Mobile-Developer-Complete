package com.bangkit.tanamoretest.ui.kebunku.repositoryKebunku;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\u000eJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/bangkit/tanamoretest/ui/kebunku/repositoryKebunku/KebunRepository;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "executorService", "Ljava/util/concurrent/ExecutorService;", "mKebunDao", "Lcom/bangkit/tanamoretest/ui/kebunku/database/KebunDao;", "delete", "", "kebun", "Lcom/bangkit/tanamoretest/ui/kebunku/database/Kebun;", "getAllKebun", "Landroidx/lifecycle/LiveData;", "", "insert", "update", "app_debug"})
public final class KebunRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.bangkit.tanamoretest.ui.kebunku.database.KebunDao mKebunDao = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.ExecutorService executorService = null;
    
    public KebunRepository(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.bangkit.tanamoretest.ui.kebunku.database.Kebun>> getAllKebun() {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.bangkit.tanamoretest.ui.kebunku.database.Kebun kebun) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    com.bangkit.tanamoretest.ui.kebunku.database.Kebun kebun) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    com.bangkit.tanamoretest.ui.kebunku.database.Kebun kebun) {
    }
}