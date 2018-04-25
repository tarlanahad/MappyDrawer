package com.tarlanahad.bakumetroview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by tarlanahad on 4/22/2018.
 */

public class BakuMetroView extends View {

    int lineShortLength = 100;
    int lineLongLength = 150;

    Paint paintLineGreen = new Paint();
    Paint paintLineRed = new Paint();
    Paint paintLinePink = new Paint();
    Paint paintLineYellow = new Paint();

    Paint paintCircleGreen = new Paint();
    Paint paintCircleRed = new Paint();

    private void init() {

        paintLineRed.setColor(Color.RED);
        paintLineRed.setStyle(Paint.Style.STROKE);
        paintLineRed.setStrokeWidth(8);

        paintLineGreen.setColor(Color.GREEN);
        paintLineGreen.setStyle(Paint.Style.STROKE);
        paintLineGreen.setStrokeWidth(8);

        paintLinePink.setColor(Color.BLUE);
        paintLinePink.setStyle(Paint.Style.STROKE);
        paintLinePink.setStrokeWidth(8);

        paintLineYellow.setColor(Color.YELLOW);
        paintLineYellow.setStyle(Paint.Style.STROKE);
        paintLineYellow.setStrokeWidth(8);


        paintCircleGreen.setColor(Color.GREEN);
        paintCircleGreen.setStyle(Paint.Style.STROKE);
        paintCircleGreen.setStrokeWidth(8);

        paintCircleRed.setColor(Color.RED);
        paintCircleRed.setStyle(Paint.Style.STROKE);
        paintCircleRed.setStrokeWidth(8);
    }

    public BakuMetroView(Context context) {
        super(context);
        init();
    }

    public BakuMetroView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BakuMetroView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    @Override
    public void onDraw(Canvas canvas) {


        startX = 500;
        startY = 30;




    }

    int startX;
    int startY;

    public void drawLineLeft(Canvas canvas,int length){

            canvas.drawCircle(startX, startY, 10, paintCircleGreen);
            startX-=10;
            canvas.drawLine(startX, startY, startX-length, startY, paintLineGreen);
            startX-=(length+10);

        }

    public void drawCurvedArrow(int x1, int y1, int x2, int y2, int curveRadius, Canvas canvas) {



        final Path path = new Path();
        int midX            = x1 + ((x2 - x1) / 2);
        int midY            = y1 + ((y2 - y1) / 2);
        float xDiff         = midX - x1;
        float yDiff         = midY - y1;
        double angle        = (Math.atan2(yDiff, xDiff) * (180 / Math.PI)) - 90;
        double angleRadians = Math.toRadians(angle);
        float pointX        = (float) (midX + curveRadius * Math.cos(angleRadians));
        float pointY        = (float) (midY + curveRadius * Math.sin(angleRadians));

        path.moveTo(x1, y1);
        path.cubicTo(x1,y1,pointX, pointY, x2, y2);
        canvas.drawPath(path, paintLineGreen);

    }

}
