package com.adjl.firstpersoncamera;

import processing.core.PApplet;
import processing.core.PVector;

class World {

    private final PApplet mSketch;
    private final float mWidth;
    private final float mHeight;
    private final float mDepth;

    World(PApplet sketch) {
        mSketch = sketch;
        mWidth = 200.0f;
        mHeight = 100.0f;
        mDepth = 200.0f;
    }

    boolean contains(PVector position) {
        return (position.x >= -mWidth / 2) && (position.x < mWidth / 2) && (position.y >= 0)
                && (position.y < mHeight) && (position.z >= -mDepth / 2)
                && (position.z < mDepth / 2);
    }

    void draw() {
        mSketch.pushMatrix();
        mSketch.translate(0, -mHeight / 2, 0);
        mSketch.box(mWidth, mHeight, mDepth);
        mSketch.popMatrix();
    }
}
