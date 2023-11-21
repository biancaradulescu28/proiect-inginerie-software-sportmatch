// Generated by view binder compiler. Do not edit!
package com.example.sportmatch.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.sportmatch.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RegisteredEventItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonToChat;

  @NonNull
  public final CardView cardEvent;

  @NonNull
  public final TextView eventDate;

  @NonNull
  public final ImageView eventIcon;

  @NonNull
  public final TextView eventParticipants;

  @NonNull
  public final TextView eventTime;

  @NonNull
  public final TextView eventTitle;

  @NonNull
  public final ImageView itemImage;

  private RegisteredEventItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button buttonToChat, @NonNull CardView cardEvent, @NonNull TextView eventDate,
      @NonNull ImageView eventIcon, @NonNull TextView eventParticipants,
      @NonNull TextView eventTime, @NonNull TextView eventTitle, @NonNull ImageView itemImage) {
    this.rootView = rootView;
    this.buttonToChat = buttonToChat;
    this.cardEvent = cardEvent;
    this.eventDate = eventDate;
    this.eventIcon = eventIcon;
    this.eventParticipants = eventParticipants;
    this.eventTime = eventTime;
    this.eventTitle = eventTitle;
    this.itemImage = itemImage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RegisteredEventItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RegisteredEventItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.registered_event_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RegisteredEventItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonToChat;
      Button buttonToChat = ViewBindings.findChildViewById(rootView, id);
      if (buttonToChat == null) {
        break missingId;
      }

      id = R.id.cardEvent;
      CardView cardEvent = ViewBindings.findChildViewById(rootView, id);
      if (cardEvent == null) {
        break missingId;
      }

      id = R.id.eventDate;
      TextView eventDate = ViewBindings.findChildViewById(rootView, id);
      if (eventDate == null) {
        break missingId;
      }

      id = R.id.eventIcon;
      ImageView eventIcon = ViewBindings.findChildViewById(rootView, id);
      if (eventIcon == null) {
        break missingId;
      }

      id = R.id.eventParticipants;
      TextView eventParticipants = ViewBindings.findChildViewById(rootView, id);
      if (eventParticipants == null) {
        break missingId;
      }

      id = R.id.eventTime;
      TextView eventTime = ViewBindings.findChildViewById(rootView, id);
      if (eventTime == null) {
        break missingId;
      }

      id = R.id.eventTitle;
      TextView eventTitle = ViewBindings.findChildViewById(rootView, id);
      if (eventTitle == null) {
        break missingId;
      }

      id = R.id.item_image;
      ImageView itemImage = ViewBindings.findChildViewById(rootView, id);
      if (itemImage == null) {
        break missingId;
      }

      return new RegisteredEventItemBinding((ConstraintLayout) rootView, buttonToChat, cardEvent,
          eventDate, eventIcon, eventParticipants, eventTime, eventTitle, itemImage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
