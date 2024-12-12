package com.bangkit.tanamoretest.ui.kebunku.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/bangkit/tanamoretest/ui/kebunku/database/KebunDao;", "", "delete", "", "kebun", "Lcom/bangkit/tanamoretest/ui/kebunku/database/Kebun;", "getAllKebun", "Landroidx/lifecycle/LiveData;", "", "insert", "update", "app_debug"})
@androidx.room.Dao()
public abstract interface KebunDao {
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.bangkit.tanamoretest.ui.kebunku.database.Kebun kebun);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.bangkit.tanamoretest.ui.kebunku.database.Kebun kebun);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.bangkit.tanamoretest.ui.kebunku.database.Kebun kebun);
    
    @androidx.room.Query(value = "SELECT * FROM Kebun")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.bangkit.tanamoretest.ui.kebunku.database.Kebun>> getAllKebun();
}