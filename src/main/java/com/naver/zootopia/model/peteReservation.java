package com.naver.zootopia.model;

public class peteReservation {
	private String pete_id;
	private String join_id;
	private String pete_kind;//��������
	private int pete_board_num; //�Խñ� ��ȣ, ����
	private String pete_kind_many;//����������
	private String pete_date;   //������۳�¥
	private String pete_date2;   //���ೡ��¥
	private int pete_price;     //���డ��
	
	public String getPete_id() {
		return pete_id;
	}
	public void setPete_id(String pete_id) {
		this.pete_id = pete_id;
	}
	public String getJoin_id() {
		return join_id;
	}
	public void setJoin_id(String join_id) {
		this.join_id = join_id;
	}
	public String getPete_kind() {
		return pete_kind;
	}
	public void setPete_kind(String pete_kind) {
		this.pete_kind = pete_kind;
	}
	public int getPete_board_num() {
		return pete_board_num;
	}
	public void setPete_board_num(int pete_board_num) {
		this.pete_board_num = pete_board_num;
	}
	public String getPete_kind_many() {
		return pete_kind_many;
	}
	public void setPete_kind_many(String pete_kind_many) {
		this.pete_kind_many = pete_kind_many;
	}
	public String getPete_date() {
		return pete_date;
	}
	public void setPete_date(String pete_date) {
		this.pete_date = pete_date;
	}
	public String getPete_date2() {
		return pete_date2;
	}
	public void setPete_date2(String pete_date2) {
		this.pete_date2 = pete_date2;
	}
	public int getPete_price() {
		return pete_price;
	}
	public void setPete_price(int pete_price) {
		this.pete_price = pete_price;
	}
}
