package com.naver.zootopia.model;

import org.springframework.web.multipart.MultipartFile;

public class peteBean {
	private String pete_id; //���̵�
	private int pete_board_num; //�۹�ȣ
	private String pete_subject;//����
	private String pete_content;//����
	private String pete_location; //����ġ
	private String pete_space; //��������
	private String pete_animals_kind; //�ٸ� ���� ����
	private String pete_walk; //�� ��å ����
	private String pete_family; //���� ����
	private String pete_house_photo; //������
	private String pete_house_original; //������ ��������
	private MultipartFile uploadfile;
	private String pete_pass; //��й�ȣ
	private String pete_time_in;//üũ��
	private String pete_time_in2;//üũ��2
	private String pete_time_out;//üũ�ƿ�
	private String pete_time_out2;//üũ�ƿ�2
	
	public String getPete_id() {
		return pete_id;
	}
	public void setPete_id(String pete_id) {
		this.pete_id = pete_id;
	}
	public int getPete_board_num() {
		return pete_board_num;
	}
	public void setPete_board_num(int pete_board_num) {
		this.pete_board_num = pete_board_num;
	}
	public String getPete_subject() {
		return pete_subject;
	}
	public void setPete_subject(String pete_subject) {
		this.pete_subject = pete_subject;
	}
	public String getPete_content() {
		return pete_content;
	}
	public void setPete_content(String pete_content) {
		this.pete_content = pete_content;
	}
	public String getPete_space() {
		return pete_space;
	}
	public void setPete_space(String pete_space) {
		this.pete_space = pete_space;
	}
	
	public String getPete_house_photo() {
		return pete_house_photo;
	}
	public void setPete_house_photo(String pete_house_photo) {
		this.pete_house_photo = pete_house_photo;
	}

	public String getPete_house_original() {
		return pete_house_original;
	}
	public void setPete_house_original(String pete_house_original) {
		this.pete_house_original = pete_house_original;
	}
	public String getPete_walk() {
		return pete_walk;
	}
	public void setPete_walk(String pete_walk) {
		this.pete_walk = pete_walk;
	}
	public String getPete_animals_kind() {
		return pete_animals_kind;
	}
	public void setPete_animals_kind(String pete_animals_kind) {
		this.pete_animals_kind = pete_animals_kind;
	}
	public String getPete_location() {
		return pete_location;
	}
	public void setPete_location(String pete_location) {
		this.pete_location = pete_location;
	}
	public String getPete_family() {
		return pete_family;
	}
	public void setPete_family(String pete_family) {
		this.pete_family = pete_family;
	}
	public MultipartFile getUploadfile() {
		return uploadfile;
	}
	public void setUploadfile(MultipartFile uploadfile) {
		this.uploadfile = uploadfile;
	}
	public String getPete_pass() {
		return pete_pass;
	}
	public void setPete_pass(String pete_pass) {
		this.pete_pass = pete_pass;
	}
	public String getPete_time_in() {
		return pete_time_in;
	}
	public void setPete_time_in(String pete_time_in) {
		this.pete_time_in = pete_time_in;
	}
	public String getPete_time_in2() {
		return pete_time_in2;
	}
	public void setPete_time_in2(String pete_time_in2) {
		this.pete_time_in2 = pete_time_in2;
	}
	public String getPete_time_out() {
		return pete_time_out;
	}
	public void setPete_time_out(String pete_time_out) {
		this.pete_time_out = pete_time_out;
	}
	public String getPete_time_out2() {
		return pete_time_out2;
	}
	public void setPete_time_out2(String pete_time_out2) {
		this.pete_time_out2 = pete_time_out2;
	}	
}
