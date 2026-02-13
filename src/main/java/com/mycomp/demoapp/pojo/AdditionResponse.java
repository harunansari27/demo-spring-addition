package com.mycomp.demoapp.pojo;

public class AdditionResponse {
    private int result;

    public AdditionResponse(int result) {
        this.result = result;
    }

    // Getter
    public int getResult() {
        return result;
    }

	@Override
	public String toString() {
		return "AdditionResponse [result=" + result + "]";
	}
}
