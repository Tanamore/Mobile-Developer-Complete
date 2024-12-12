package com.bangkit.tanamoretest.ui.kebunku.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/bangkit/tanamoretest/ui/kebunku/database/KebunRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "kebunDao", "Lcom/bangkit/tanamoretest/ui/kebunku/database/KebunDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.bangkit.tanamoretest.ui.kebunku.database.Kebun.class}, version = 1)
public abstract class KebunRoomDatabase extends androidx.room.RoomDatabase {
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile com.bangkit.tanamoretest.ui.kebunku.database.KebunRoomDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_1_2 = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.bangkit.tanamoretest.ui.kebunku.database.KebunRoomDatabase.Companion Companion = null;
    
    public KebunRoomDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.bangkit.tanamoretest.ui.kebunku.database.KebunDao kebunDao();
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final com.bangkit.tanamoretest.ui.kebunku.database.KebunRoomDatabase getDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/bangkit/tanamoretest/ui/kebunku/database/KebunRoomDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/bangkit/tanamoretest/ui/kebunku/database/KebunRoomDatabase;", "MIGRATION_1_2", "Landroidx/room/migration/Migration;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        @org.jetbrains.annotations.NotNull()
        public final com.bangkit.tanamoretest.ui.kebunku.database.KebunRoomDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}