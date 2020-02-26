// Generated by data binding compiler. Do not edit!
package com.example.android.aboutme.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.android.aboutme.MyInfo;
import com.example.android.aboutme.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @NonNull
  public final EditText ageEdit;

  @NonNull
  public final TextView ageLabel;

  @NonNull
  public final TextView ageText;

  @NonNull
  public final ScrollView bioScroll;

  @NonNull
  public final EditText birthdayEdit;

  @NonNull
  public final TextView birthdayLabel;

  @NonNull
  public final TextView birthdayText;

  @NonNull
  public final EditText courseEdit;

  @NonNull
  public final TextView courseLabel;

  @NonNull
  public final TextView courseText;

  @NonNull
  public final EditText crushEdit;

  @NonNull
  public final TextView crushLabel;

  @NonNull
  public final TextView crushText;

  @NonNull
  public final Button doneButton;

  @NonNull
  public final EditText dreamEdit;

  @NonNull
  public final TextView dreamLabel;

  @NonNull
  public final TextView dreamText;

  @NonNull
  public final EditText emailEdit;

  @NonNull
  public final TextView emailLabel;

  @NonNull
  public final TextView emailText;

  @NonNull
  public final TextView hello;

  @NonNull
  public final EditText messageEdit;

  @NonNull
  public final TextView messageLabel;

  @NonNull
  public final TextView messageText;

  @NonNull
  public final EditText nameEdit;

  @NonNull
  public final TextView nameLabel;

  @NonNull
  public final TextView nameText;

  @NonNull
  public final EditText nicknameEdit;

  @NonNull
  public final TextView nicknameLabel;

  @NonNull
  public final TextView nicknameText;

  @NonNull
  public final EditText phoneEdit;

  @NonNull
  public final TextView phoneLabel;

  @NonNull
  public final TextView phoneText;

  @NonNull
  public final TextView thankYou;

  @Bindable
  protected MyInfo mMyInfo;

  protected ActivityMainBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText ageEdit, TextView ageLabel, TextView ageText, ScrollView bioScroll,
      EditText birthdayEdit, TextView birthdayLabel, TextView birthdayText, EditText courseEdit,
      TextView courseLabel, TextView courseText, EditText crushEdit, TextView crushLabel,
      TextView crushText, Button doneButton, EditText dreamEdit, TextView dreamLabel,
      TextView dreamText, EditText emailEdit, TextView emailLabel, TextView emailText,
      TextView hello, EditText messageEdit, TextView messageLabel, TextView messageText,
      EditText nameEdit, TextView nameLabel, TextView nameText, EditText nicknameEdit,
      TextView nicknameLabel, TextView nicknameText, EditText phoneEdit, TextView phoneLabel,
      TextView phoneText, TextView thankYou) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ageEdit = ageEdit;
    this.ageLabel = ageLabel;
    this.ageText = ageText;
    this.bioScroll = bioScroll;
    this.birthdayEdit = birthdayEdit;
    this.birthdayLabel = birthdayLabel;
    this.birthdayText = birthdayText;
    this.courseEdit = courseEdit;
    this.courseLabel = courseLabel;
    this.courseText = courseText;
    this.crushEdit = crushEdit;
    this.crushLabel = crushLabel;
    this.crushText = crushText;
    this.doneButton = doneButton;
    this.dreamEdit = dreamEdit;
    this.dreamLabel = dreamLabel;
    this.dreamText = dreamText;
    this.emailEdit = emailEdit;
    this.emailLabel = emailLabel;
    this.emailText = emailText;
    this.hello = hello;
    this.messageEdit = messageEdit;
    this.messageLabel = messageLabel;
    this.messageText = messageText;
    this.nameEdit = nameEdit;
    this.nameLabel = nameLabel;
    this.nameText = nameText;
    this.nicknameEdit = nicknameEdit;
    this.nicknameLabel = nicknameLabel;
    this.nicknameText = nicknameText;
    this.phoneEdit = phoneEdit;
    this.phoneLabel = phoneLabel;
    this.phoneText = phoneText;
    this.thankYou = thankYou;
  }

  public abstract void setMyInfo(@Nullable MyInfo myInfo);

  @Nullable
  public MyInfo getMyInfo() {
    return mMyInfo;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMainBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMainBinding)bind(component, view, R.layout.activity_main);
  }
}
