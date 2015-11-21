package com.oop.themazeofmemory;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by user on 2015-11-20.
 */
public class GameView extends GLSurfaceView {

    private final GLRenderer mRenderer;

    public GameView(Context context,AttributeSet attrs) {
        super(context,attrs);

        // Create an OpenGL ES 2.0 context.
        setEGLContextClientVersion(2);

        // Set the Renderer for drawing on the GLSurfaceView
        mRenderer = new GLRenderer();
        setRenderer(mRenderer);

        // Render the view only when there is a change in the drawing data
        //setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);

        setPreserveEGLContextOnPause(true);
    }

    private final float TOUCH_SCALE_FACTOR = 180.0f / 320;
    private float mPreviousX;
    private float mPreviousY;

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        // MotionEvent reports input details from the touch screen
        // and other input controls. In this case, you are only
        // interested in events where the touch position changed.

        float x = e.getX();
        float y = e.getY();

        switch (e.getAction()) {
            case MotionEvent.ACTION_MOVE:


                        float dx = x - mPreviousX;
                        float dy = y - mPreviousY;

                        // reverse direction of rotation above the mid-line
                        if (y > getHeight() / 2) {
                            dx = dx * -1 ;
                        }

                        // reverse direction of rotation to left of the mid-line
                        if (x < getWidth() / 2) {
                            dy = dy * -1 ;
                        }

                        final float dx_temp = dx;
                        final float dy_temp = dy;
                 queueEvent(new Runnable()
                {
                  @Override
                   public void run()
                 {
                        mRenderer.setAngle(
                                mRenderer.getAngle() +
                                        ((dx_temp + dy_temp) * TOUCH_SCALE_FACTOR));  // = 180.0f / 320
                        //requestRender();
                    }
                });


        }

        mPreviousX = x;
        mPreviousY = y;
        return true;
    }

}
