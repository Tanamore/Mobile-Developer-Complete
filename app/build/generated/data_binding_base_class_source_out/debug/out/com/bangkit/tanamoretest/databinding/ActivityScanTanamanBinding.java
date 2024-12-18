// Generated by view binder compiler. Do not edit!
package com.bangkit.tanamoretest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bangkit.tanamoretest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityScanTanamanBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout button;

  @NonNull
  public final ImageButton buttonAnalyze;

  @NonNull
  public final ImageButton buttonGallery;

  @NonNull
  public final ImageButton buttonShutter;

  @NonNull
  public final LinearLayout headerLayout;

  @NonNull
  public final ImageView icBack;

  @NonNull
  public final ImageView imagePreview;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextView pageTitle;

  @NonNull
  public final PreviewView previewView;

  @NonNull
  public final ProgressBar progressBar;

  private ActivityScanTanamanBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout button, @NonNull ImageButton buttonAnalyze,
      @NonNull ImageButton buttonGallery, @NonNull ImageButton buttonShutter,
      @NonNull LinearLayout headerLayout, @NonNull ImageView icBack,
      @NonNull ImageView imagePreview, @NonNull ConstraintLayout main, @NonNull TextView pageTitle,
      @NonNull PreviewView previewView, @NonNull ProgressBar progressBar) {
    this.rootView = rootView;
    this.button = button;
    this.buttonAnalyze = buttonAnalyze;
    this.buttonGallery = buttonGallery;
    this.buttonShutter = buttonShutter;
    this.headerLayout = headerLayout;
    this.icBack = icBack;
    this.imagePreview = imagePreview;
    this.main = main;
    this.pageTitle = pageTitle;
    this.previewView = previewView;
    this.progressBar = progressBar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityScanTanamanBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityScanTanamanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_scan_tanaman, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityScanTanamanBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      LinearLayout button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.buttonAnalyze;
      ImageButton buttonAnalyze = ViewBindings.findChildViewById(rootView, id);
      if (buttonAnalyze == null) {
        break missingId;
      }

      id = R.id.buttonGallery;
      ImageButton buttonGallery = ViewBindings.findChildViewById(rootView, id);
      if (buttonGallery == null) {
        break missingId;
      }

      id = R.id.buttonShutter;
      ImageButton buttonShutter = ViewBindings.findChildViewById(rootView, id);
      if (buttonShutter == null) {
        break missingId;
      }

      id = R.id.headerLayout;
      LinearLayout headerLayout = ViewBindings.findChildViewById(rootView, id);
      if (headerLayout == null) {
        break missingId;
      }

      id = R.id.ic_back;
      ImageView icBack = ViewBindings.findChildViewById(rootView, id);
      if (icBack == null) {
        break missingId;
      }

      id = R.id.imagePreview;
      ImageView imagePreview = ViewBindings.findChildViewById(rootView, id);
      if (imagePreview == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.pageTitle;
      TextView pageTitle = ViewBindings.findChildViewById(rootView, id);
      if (pageTitle == null) {
        break missingId;
      }

      id = R.id.previewView;
      PreviewView previewView = ViewBindings.findChildViewById(rootView, id);
      if (previewView == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      return new ActivityScanTanamanBinding((ConstraintLayout) rootView, button, buttonAnalyze,
          buttonGallery, buttonShutter, headerLayout, icBack, imagePreview, main, pageTitle,
          previewView, progressBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
