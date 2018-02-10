package com.mycompany.app;

import org.springframework.stereotype.Component;

@Component
public class Shevchenko implements Poem{
	private static String[] LINES = {
	"����� �������� ���� ����,",
	"����� ��� ������� ������,",
	"�������� � ������� �����,",
	"������� ����� ������,",
	"� ����� �������� �����.",
	"���'� ������ ���� ����,",
	"������� ������� ����.",
	"����� �������� ����,",
	"� ���� ���� �������,",
	"��� ��������� �� ��.",
	"������� ���� ���� ����",
	"��������� ������ ����;",
	"���� ������� ���� ��.",
	"������� ���, ����� ������",
	"�� ��������� �� �����."};
	
	public Shevchenko(){}
	
	public void recite() {
		for (int i=0;i<LINES.length; i++){
			System.out.println(LINES[i]);
		}
	}
}
