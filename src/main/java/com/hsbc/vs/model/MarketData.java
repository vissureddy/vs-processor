package com.hsbc.vs.model;

import java.io.Serializable;

public class MarketData implements Serializable {

	private static final long serialVersionUID = 1L;
	private String ticker;
	private double openingPrice;
	private double closingPrice;
	private double peRatio;

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public double getOpeningPrice() {
		return openingPrice;
	}

	public void setOpeningPrice(double openingPrice) {
		this.openingPrice = openingPrice;
	}

	public double getClosingPrice() {
		return closingPrice;
	}

	public void setClosingPrice(double closingPrice) {
		this.closingPrice = closingPrice;
	}

	public double getPeRatio() {
		return peRatio;
	}

	public void setPeRatio(double peRatio) {
		this.peRatio = peRatio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(closingPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(openingPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(peRatio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((ticker == null) ? 0 : ticker.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarketData other = (MarketData) obj;
		if (Double.doubleToLongBits(closingPrice) != Double.doubleToLongBits(other.closingPrice))
			return false;
		if (Double.doubleToLongBits(openingPrice) != Double.doubleToLongBits(other.openingPrice))
			return false;
		if (Double.doubleToLongBits(peRatio) != Double.doubleToLongBits(other.peRatio))
			return false;
		if (ticker == null) {
			if (other.ticker != null)
				return false;
		} else if (!ticker.equals(other.ticker))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MarketData [ticker=" + ticker + ", openingPrice=" + openingPrice + ", closingPrice=" + closingPrice
				+ ", peRatio=" + peRatio + "]";
	}

	
}
