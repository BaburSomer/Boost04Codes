package com.bilgeadam.course04.lesson22;

public class ProcessingCannotBeContinuedException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ProcessingCannotBeContinuedException() {
		super("İşlem devam ettirilemiyor");
	}
}
