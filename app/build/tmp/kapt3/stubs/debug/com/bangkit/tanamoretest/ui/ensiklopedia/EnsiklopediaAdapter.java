package com.bangkit.tanamoretest.ui.ensiklopedia;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u0011B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/bangkit/tanamoretest/response/DataItem;", "Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaAdapter$EnsiklopediaViewHolder;", "onItemClick", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "EnsiklopediaDiffCallback", "EnsiklopediaViewHolder", "app_debug"})
public final class EnsiklopediaAdapter extends androidx.recyclerview.widget.ListAdapter<com.bangkit.tanamoretest.response.DataItem, com.bangkit.tanamoretest.ui.ensiklopedia.EnsiklopediaAdapter.EnsiklopediaViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.bangkit.tanamoretest.response.DataItem, kotlin.Unit> onItemClick = null;
    
    public EnsiklopediaAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.bangkit.tanamoretest.response.DataItem, kotlin.Unit> onItemClick) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.bangkit.tanamoretest.ui.ensiklopedia.EnsiklopediaAdapter.EnsiklopediaViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.bangkit.tanamoretest.ui.ensiklopedia.EnsiklopediaAdapter.EnsiklopediaViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaAdapter$EnsiklopediaDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/bangkit/tanamoretest/response/DataItem;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class EnsiklopediaDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.bangkit.tanamoretest.response.DataItem> {
        
        public EnsiklopediaDiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.bangkit.tanamoretest.response.DataItem oldItem, @org.jetbrains.annotations.NotNull()
        com.bangkit.tanamoretest.response.DataItem newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.bangkit.tanamoretest.response.DataItem oldItem, @org.jetbrains.annotations.NotNull()
        com.bangkit.tanamoretest.response.DataItem newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaAdapter$EnsiklopediaViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/bangkit/tanamoretest/databinding/ItemEnsiklopediaBinding;", "onItemClick", "Lkotlin/Function1;", "Lcom/bangkit/tanamoretest/response/DataItem;", "", "(Lcom/bangkit/tanamoretest/databinding/ItemEnsiklopediaBinding;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "app_debug"})
    public static final class EnsiklopediaViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.bangkit.tanamoretest.databinding.ItemEnsiklopediaBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<com.bangkit.tanamoretest.response.DataItem, kotlin.Unit> onItemClick = null;
        
        public EnsiklopediaViewHolder(@org.jetbrains.annotations.NotNull()
        com.bangkit.tanamoretest.databinding.ItemEnsiklopediaBinding binding, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.bangkit.tanamoretest.response.DataItem, kotlin.Unit> onItemClick) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.bangkit.tanamoretest.response.DataItem item) {
        }
    }
}