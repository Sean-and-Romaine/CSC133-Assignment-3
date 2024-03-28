package com.gamescodeschool.snakegame;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;

public class HUD {

    public static void drawBackground(Canvas canvas) {
        canvas.drawColor(Color.argb(255,40, 72, 203));
    }

    public static void drawHud(Canvas canvas, Paint paint) {
        paint.setColor(Color.WHITE);
        paint.setTextSize(175);
        String firstName = "Romaine";
        float firstNameWidth = paint.measureText(firstName);
        int margin = 20; // Margin from the left edge
        int scoreTextHeight = 120; // Height of the score text
        float textWidth = paint.measureText(firstName);
        // Calculate the X position to display the text on the right side
        float x1 = canvas.getWidth() - textWidth - margin;

        // Draw the score text at position (margin, scoreTextHeight)
        canvas.drawText(firstName, x1, scoreTextHeight, paint);

        // Draw additional text underneath the score
        String secondName = "Sean";
        float secondNameWidth = paint.measureText(secondName);
        float x2 = canvas.getWidth() - secondNameWidth - margin;; // Center the text horizontally
        float y = scoreTextHeight + paint.getTextSize() + 20; // Position the text below the score
        canvas.drawText(secondName, x2, y, paint);
    }

    public static void drawScore(Canvas canvas, Paint paint, int score) {
        paint.setColor(Color.WHITE);
        paint.setTextSize(175);
        Typeface typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.BOLD);
        paint.setTypeface(typeface);
        String text = "Score: " + score;
        float textWidth = paint.measureText(text);
        int margin = 20; // Margin from the right edge
        // Draw the text at position (x, 120)
        canvas.drawText(text, margin, 120, paint);
    }
}
