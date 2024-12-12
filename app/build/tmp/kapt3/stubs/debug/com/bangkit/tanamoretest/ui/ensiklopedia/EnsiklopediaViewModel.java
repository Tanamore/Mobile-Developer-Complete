package com.bangkit.tanamoretest.ui.ensiklopedia;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0018R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f\u00a8\u0006\u001d"}, d2 = {"Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_ensiklopediaDetailState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaViewModel$EnsiklopediaDetailState;", "_ensiklopediaState", "Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaViewModel$EnsiklopediaState;", "_searchResults", "Lcom/bangkit/tanamoretest/response/SearchEnsiklopediaResponse;", "apiService", "Lcom/bangkit/tanamoretest/api/ApiService;", "ensiklopediaDetailState", "Landroidx/lifecycle/LiveData;", "getEnsiklopediaDetailState", "()Landroidx/lifecycle/LiveData;", "ensiklopediaState", "getEnsiklopediaState", "searchResults", "getSearchResults", "fetchEnsiklopedia", "", "fetchEnsiklopediaDetail", "plantId", "", "searchEnsiklopedia", "query", "EnsiklopediaDetailState", "EnsiklopediaState", "app_debug"})
public final class EnsiklopediaViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.bangkit.tanamoretest.ui.ensiklopedia.EnsiklopediaViewModel.EnsiklopediaState> _ensiklopediaState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.bangkit.tanamoretest.ui.ensiklopedia.EnsiklopediaViewModel.EnsiklopediaState> ensiklopediaState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.bangkit.tanamoretest.ui.ensiklopedia.EnsiklopediaViewModel.EnsiklopediaDetailState> _ensiklopediaDetailState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.bangkit.tanamoretest.ui.ensiklopedia.EnsiklopediaViewModel.EnsiklopediaDetailState> ensiklopediaDetailState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.bangkit.tanamoretest.response.SearchEnsiklopediaResponse> _searchResults = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.bangkit.tanamoretest.response.SearchEnsiklopediaResponse> searchResults = null;
    @org.jetbrains.annotations.NotNull()
    private final com.bangkit.tanamoretest.api.ApiService apiService = null;
    
    public EnsiklopediaViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.bangkit.tanamoretest.ui.ensiklopedia.EnsiklopediaViewModel.EnsiklopediaState> getEnsiklopediaState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.bangkit.tanamoretest.ui.ensiklopedia.EnsiklopediaViewModel.EnsiklopediaDetailState> getEnsiklopediaDetailState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.bangkit.tanamoretest.response.SearchEnsiklopediaResponse> getSearchResults() {
        return null;
    }
    
    public final void fetchEnsiklopedia() {
    }
    
    public final void fetchEnsiklopediaDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String plantId) {
    }
    
    public final void searchEnsiklopedia(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaViewModel$EnsiklopediaDetailState;", "", "()V", "Error", "Loading", "Success", "Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaViewModel$EnsiklopediaDetailState$Error;", "Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaViewModel$EnsiklopediaDetailState$Loading;", "Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaViewModel$EnsiklopediaDetailState$Success;", "app_debug"})
    public static abstract class EnsiklopediaDetailState {
        
        private EnsiklopediaDetailState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaViewModel$EnsiklopediaDetailState$Error;", "Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaViewModel$EnsiklopediaDetailState;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class Error extends com.bangkit.tanamoretest.ui.ensiklopedia.EnsiklopediaViewModel.EnsiklopediaDetailState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String message = null;
            
            public Error(@org.jetbrains.annotations.NotNull()
            java.lang.String message) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getMessage() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.bangkit.tanamoretest.ui.ensiklopedia.EnsiklopediaViewModel.EnsiklopediaDetailState.Error copy(@org.jetbrains.annotations.NotNull()
            java.lang.String message) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaViewModel$EnsiklopediaDetailState$Loading;", "Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaViewModel$EnsiklopediaDetailState;", "()V", "app_debug"})
        public static final class Loading extends com.bangkit.tanamoretest.ui.ensiklopedia.EnsiklopediaViewModel.EnsiklopediaDetailState {
            @org.jetbrains.annotations.NotNull()
            public static final com.bangkit.tanamoretest.ui.ensiklopedia.EnsiklopediaViewModel.EnsiklopediaDetailState.Loading INSTANCE = null;
            
            private Loading() {
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaViewModel$EnsiklopediaDetailState$Success;", "Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaViewModel$EnsiklopediaDetailState;", "ensiklopediaDetail", "Lcom/bangkit/tanamoretest/response/DataItem;", "(Lcom/bangkit/tanamoretest/response/DataItem;)V", "getEnsiklopediaDetail", "()Lcom/bangkit/tanamoretest/response/DataItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Success extends com.bangkit.tanamoretest.ui.ensiklopedia.EnsiklopediaViewModel.EnsiklopediaDetailState {
            @org.jetbrains.annotations.NotNull()
            private final com.bangkit.tanamoretest.response.DataItem ensiklopediaDetail = null;
            
            public Success(@org.jetbrains.annotations.NotNull()
            com.bangkit.tanamoretest.response.DataItem ensiklopediaDetail) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.bangkit.tanamoretest.response.DataItem getEnsiklopediaDetail() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.bangkit.tanamoretest.response.DataItem component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.bangkit.tanamoretest.ui.ensiklopedia.EnsiklopediaViewModel.EnsiklopediaDetailState.Success copy(@org.jetbrains.annotations.NotNull()
            com.bangkit.tanamoretest.response.DataItem ensiklopediaDetail) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaViewModel$EnsiklopediaState;", "", "()V", "Error", "Loading", "Success", "Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaViewModel$EnsiklopediaState$Error;", "Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaViewModel$EnsiklopediaState$Loading;", "Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaViewModel$EnsiklopediaState$Success;", "app_debug"})
    public static abstract class EnsiklopediaState {
        
        private EnsiklopediaState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaViewModel$EnsiklopediaState$Error;", "Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaViewModel$EnsiklopediaState;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class Error extends com.bangkit.tanamoretest.ui.ensiklopedia.EnsiklopediaViewModel.EnsiklopediaState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String message = null;
            
            public Error(@org.jetbrains.annotations.NotNull()
            java.lang.String message) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getMessage() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.bangkit.tanamoretest.ui.ensiklopedia.EnsiklopediaViewModel.EnsiklopediaState.Error copy(@org.jetbrains.annotations.NotNull()
            java.lang.String message) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaViewModel$EnsiklopediaState$Loading;", "Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaViewModel$EnsiklopediaState;", "()V", "app_debug"})
        public static final class Loading extends com.bangkit.tanamoretest.ui.ensiklopedia.EnsiklopediaViewModel.EnsiklopediaState {
            @org.jetbrains.annotations.NotNull()
            public static final com.bangkit.tanamoretest.ui.ensiklopedia.EnsiklopediaViewModel.EnsiklopediaState.Loading INSTANCE = null;
            
            private Loading() {
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaViewModel$EnsiklopediaState$Success;", "Lcom/bangkit/tanamoretest/ui/ensiklopedia/EnsiklopediaViewModel$EnsiklopediaState;", "ensiklopedia", "", "Lcom/bangkit/tanamoretest/response/DataItem;", "(Ljava/util/List;)V", "getEnsiklopedia", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Success extends com.bangkit.tanamoretest.ui.ensiklopedia.EnsiklopediaViewModel.EnsiklopediaState {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.bangkit.tanamoretest.response.DataItem> ensiklopedia = null;
            
            public Success(@org.jetbrains.annotations.NotNull()
            java.util.List<com.bangkit.tanamoretest.response.DataItem> ensiklopedia) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.bangkit.tanamoretest.response.DataItem> getEnsiklopedia() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.bangkit.tanamoretest.response.DataItem> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.bangkit.tanamoretest.ui.ensiklopedia.EnsiklopediaViewModel.EnsiklopediaState.Success copy(@org.jetbrains.annotations.NotNull()
            java.util.List<com.bangkit.tanamoretest.response.DataItem> ensiklopedia) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
        }
    }
}