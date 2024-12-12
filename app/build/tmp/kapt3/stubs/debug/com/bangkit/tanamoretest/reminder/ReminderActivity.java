package com.bangkit.tanamoretest.reminder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u000fH\u0002J\u001e\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/bangkit/tanamoretest/reminder/ReminderActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/bangkit/tanamoretest/databinding/ActivityReminderBinding;", "getBinding", "()Lcom/bangkit/tanamoretest/databinding/ActivityReminderBinding;", "binding$delegate", "Lkotlin/Lazy;", "taskAdapter", "Lcom/bangkit/tanamoretest/reminder/ReminderAdapter;", "taskList", "", "LReminder;", "checkTaskListEmpty", "", "createNotificationChannel", "deleteTask", "task", "sharedPreferences", "Landroid/content/SharedPreferences;", "getStatusBarHeight", "", "loadTaskList", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "requestNotificationPermission", "saveTaskList", "app_debug"})
public final class ReminderActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.bangkit.tanamoretest.reminder.ReminderAdapter taskAdapter;
    private java.util.List<Reminder> taskList;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    
    public ReminderActivity() {
        super();
    }
    
    private final com.bangkit.tanamoretest.databinding.ActivityReminderBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void checkTaskListEmpty() {
    }
    
    private final java.util.List<Reminder> loadTaskList(android.content.SharedPreferences sharedPreferences) {
        return null;
    }
    
    private final void saveTaskList(android.content.SharedPreferences sharedPreferences, java.util.List<Reminder> taskList) {
    }
    
    private final void deleteTask(Reminder task, android.content.SharedPreferences sharedPreferences) {
    }
    
    private final void requestNotificationPermission() {
    }
    
    private final void createNotificationChannel() {
    }
    
    private final int getStatusBarHeight() {
        return 0;
    }
}