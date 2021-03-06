package com.github.quadflask.smartcrop;

import java.awt.image.BufferedImage;

/**
 * Created by flask on 2015. 10. 30..
 */
public class Options {
	public static final Options DEFAULT = new Options();

	private boolean debug = false;
	private int cropWidth = 100;
	private int cropHeight = 100;
	private float detailWeight = .2f;
	private float[] skinColor = {0.78f, 0.57f, 0.44f};
	private float skinBias = .01f;
	private float skinBrightnessMin = 0.2f;
	private float skinBrightnessMax = 1.0f;
	private float skinThreshold = 0.8f;
	private float skinWeight = 1.8f;
	private float saturationBrightnessMin = 0.05f;
	private float saturationBrightnessMax = 0.9f;
	private float saturationThreshold = 0.4f;
	private float saturationBias = 0.2f;
	private float saturationWeight = 0.1f;
	// step * minscale rounded down to the next power of two should be good
	private int scoreDownSample = 8;
	public int step = 8;
	private float scaleStep = 0.1f;
	private float minScale = 0.8f;
	private float maxScale = 1.0f;
	private float edgeRadius = 0.4f;
	private float edgeWeight = -20f;
	private float outsideImportance = -.5f;
	private float prescale = 1f;
	private float boostWeight = 100.0f;
	private boolean ruleOfThirds = true;
	private int bufferedBitmapType = BufferedImage.TYPE_INT_ARGB;
	private Crop[] boost = null;

	public void setCropWidth(int cropWidth) {
		this.cropWidth = cropWidth;
	}

	public void setCropHeight(int cropHeight) {
		this.cropHeight = cropHeight;
	}

	public int getCropWidth() {
		return cropWidth;
	}

	public Options cropWidth(int cropWidth) {
		this.cropWidth = cropWidth;
		return this;
	}

	public int getCropHeight() {
		return cropHeight;
	}

	public Options cropHeight(int cropHeight) {
		this.cropHeight = cropHeight;
		return this;
	}

	public float getDetailWeight() {
		return detailWeight;
	}

	public Options detailWeight(float detailWeight) {
		this.detailWeight = detailWeight;
		return this;
	}

	public float[] getSkinColor() {
		return skinColor;
	}

	public Options skinColor(float[] skinColor) {
		this.skinColor = skinColor;
		return this;
	}

	public float getSkinBias() {
		return skinBias;
	}

	public Options skinBias(float skinBias) {
		this.skinBias = skinBias;
		return this;
	}

	public float getSkinBrightnessMin() {
		return skinBrightnessMin;
	}

	public Options skinBrightnessMin(float skinBrightnessMin) {
		this.skinBrightnessMin = skinBrightnessMin;
		return this;
	}

	public float getSkinBrightnessMax() {
		return skinBrightnessMax;
	}

	public Options skinBrightnessMax(float skinBrightnessMax) {
		this.skinBrightnessMax = skinBrightnessMax;
		return this;
	}

	public float getSkinThreshold() {
		return skinThreshold;
	}

	public Options skinThreshold(float skinThreshold) {
		this.skinThreshold = skinThreshold;
		return this;
	}

	public float getSkinWeight() {
		return skinWeight;
	}

	public Options skinWeight(float skinWeight) {
		this.skinWeight = skinWeight;
		return this;
	}

	public float getSaturationBrightnessMin() {
		return saturationBrightnessMin;
	}

	public Options saturationBrightnessMin(float saturationBrightnessMin) {
		this.saturationBrightnessMin = saturationBrightnessMin;
		return this;
	}

	public float getSaturationBrightnessMax() {
		return saturationBrightnessMax;
	}

	public Options saturationBrightnessMax(float saturationBrightnessMax) {
		this.saturationBrightnessMax = saturationBrightnessMax;
		return this;
	}

	public float getSaturationThreshold() {
		return saturationThreshold;
	}

	public Options saturationThreshold(float saturationThreshold) {
		this.saturationThreshold = saturationThreshold;
		return this;
	}

	public float getSaturationBias() {
		return saturationBias;
	}

	public Options saturationBias(float saturationBias) {
		this.saturationBias = saturationBias;
		return this;
	}

	public float getSaturationWeight() {
		return saturationWeight;
	}

	public Options saturationWeight(float saturationWeight) {
		this.saturationWeight = saturationWeight;
		return this;
	}

	public int getScoreDownSample() {
		return scoreDownSample;
	}

	public Options scoreDownSample(int scoreDownSample) {
		this.scoreDownSample = scoreDownSample;
		return this;
	}

	public float getScaleStep() {
		return scaleStep;
	}

	public Options scaleStep(float scaleStep) {
		this.scaleStep = scaleStep;
		return this;
	}

	public float getMinScale() {
		return minScale;
	}

	public Options minScale(float minScale) {
		this.minScale = minScale;
		return this;
	}

	public float getMaxScale() {
		return maxScale;
	}

	public Options maxScale(float maxScale) {
		this.maxScale = maxScale;
		return this;
	}

	public float getEdgeRadius() {
		return edgeRadius;
	}

	public Options edgeRadius(float edgeRadius) {
		this.edgeRadius = edgeRadius;
		return this;
	}

	public float getEdgeWeight() {
		return edgeWeight;
	}

	public Options edgeWeight(float edgeWeight) {
		this.edgeWeight = edgeWeight;
		return this;
	}

	public float getOutsideImportance() {
		return outsideImportance;
	}

	public Options outsideImportance(float outsideImportance) {
		this.outsideImportance = outsideImportance;
		return this;
	}

	public Crop[] getBoost() {
		return boost;
	}

	public void setBoost(Crop[] boost) {
		this.boost = boost;
	}

	public float getBoostWeight() {
		return boostWeight;
	}

	public float getPrescale() {
		return prescale;
	}

	public void setPrescale(float prescale) {
		this.prescale = prescale;
	}

	public boolean isRuleOfThirds() {
		return ruleOfThirds;
	}

	public Options ruleOfThirds(boolean ruleOfThirds) {
		this.ruleOfThirds = ruleOfThirds;
		return this;
	}

	public int getBufferedBitmapType() {
		return bufferedBitmapType;
	}

	public Options bufferedBitmapType(int bufferedBitmapType) {
		this.bufferedBitmapType = bufferedBitmapType;
		return this;
	}

	public boolean isDebug() {
		return debug;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}
}