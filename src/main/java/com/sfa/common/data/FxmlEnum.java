package com.sfa.common.data;

public enum FxmlEnum {
	// 登录
	login(400, 240, "登录", "/fxml/login.fxml", false),
	// 主页面
	main(1024, 768, "GHS配载系统客户端 - V0.1 Demo", "/fxml/main.fxml", true),
	// 关于
	about(400, 300, "关于", "/fxml/help/about.fxml", false);

	private double width;
	private double height;
	private String title;
	private String file;
	private boolean resizable;

	private FxmlEnum(double width, double height, String title, String file, boolean resizable) {
		this.width = width;
		this.height = height;
		this.title = title;
		this.file = file;
		this.resizable = resizable;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public String getTitle() {
		return title;
	}

	public String getFile() {
		return file;
	}

	public boolean isResizable() {
		return resizable;
	}
}