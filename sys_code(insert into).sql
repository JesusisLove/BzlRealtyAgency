select table_mng_no,table_field_no,table_code_id,code_value from sys_codevaluemst order by table_mng_no,table_field_no,table_code_id;
insert into sys_codetablemst(sys_id,table_mng_no,table_name)values('SysId001','CT-KEIYAKU-001','物件情報');
insert into sys_codetablemst(sys_id,table_mng_no,table_name)values('SysId001','CT-KEIYAKU-002','鍵情報');
insert into sys_codetablemst(sys_id,table_mng_no,table_name)values('SysId001','CT-KEIYAKU-003','日勤管理会社');
insert into sys_codetablemst(sys_id,table_mng_no,table_name)values('SysId001','CT-KEIYAKU-004','修繕履歴');
insert into sys_codetablemst(sys_id,table_mng_no,table_name)values('SysId001','CT-KEIYAKU-005','物件所有者');
insert into sys_codetablemst(sys_id,table_mng_no,table_name)values('SysId001','CT-KEIYAKU-006','物件管理会社');
insert into sys_codetablemst(sys_id,table_mng_no,table_name)values('SysId001','CT-KEIYAKU-007','口座管理');
insert into sys_codetablemst(sys_id,table_mng_no,table_name)values('SysId001','CT-KEIYAKU-008','個人契約者');
insert into sys_codetablemst(sys_id,table_mng_no,table_name)values('SysId001','CT-KEIYAKU-009','法人契約者');
insert into sys_codetablemst(sys_id,table_mng_no,table_name)values('SysId001','CT-KEIYAKU-010','賃貸契約');
insert into sys_codetablemst(sys_id,table_mng_no,table_name)values('SysId001','CT-KEIYAKU-011','大家さん契約');
insert into sys_codetablemst(sys_id,table_mng_no,table_name)values('SysId001','CT-KEIYAKU-012','保証会社情報');
insert into sys_codetablemst(sys_id,table_mng_no,table_name)values('SysId001','CT-KEIYAKU-013','保証会社プラン情報');
insert into sys_codetablemst(sys_id,table_mng_no,table_name)values('SysId001','CT-KEIYAKU-014','家財保険会社情報');
insert into sys_codetablemst(sys_id,table_mng_no,table_name)values('SysId001','CT-KEIYAKU-015','家財保険プラン情報');
insert into sys_codetablemst(sys_id,table_mng_no,table_name)values('SysId001','CT-KEIYAKU-016','仲介会社');
insert into sys_codetablemst(sys_id,table_mng_no,table_name)values('SysId001','CT-KEIYAKU-017','紹介人');
insert into sys_codetablemst(sys_id,table_mng_no,table_name)values('SysId001','CT-KEIYAKU-018','保証人情報');
insert into sys_codetablemst(sys_id,table_mng_no,table_name)values('SysId001','CT-KEIYAKU-019','入居者管理');
insert into sys_codetablemst(sys_id,table_mng_no,table_name)values('SysId001','CT-KEIYAKU-020','勤務先');
insert into sys_codetablemst(sys_id,table_mng_no,table_name)values('SysId001','CT-KEIYAKU-021','緊急連絡先');
insert into sys_codetablemst(sys_id,table_mng_no,table_name)values('SysId001','CT-KEIYAKU-022','意向金情報');
insert into sys_codefieldsmst(sys_id,table_mng_no,table_field_no,table_field_name) values('SysId001','CT-KEIYAKU-001','01','用途');
insert into sys_codefieldsmst(sys_id,table_mng_no,table_field_no,table_field_name) values('SysId001','CT-KEIYAKU-001','02','ステータス');
insert into sys_codefieldsmst(sys_id,table_mng_no,table_field_no,table_field_name) values('SysId001','CT-KEIYAKU-001','03','物件所有区分');
insert into sys_codefieldsmst(sys_id,table_mng_no,table_field_no,table_field_name) values('SysId001','CT-KEIYAKU-002','01','マスタキー有無');
insert into sys_codefieldsmst(sys_id,table_mng_no,table_field_no,table_field_name) values('SysId001','CT-KEIYAKU-002','02','用途区分');
insert into sys_codefieldsmst(sys_id,table_mng_no,table_field_no,table_field_name) values('SysId001','CT-KEIYAKU-002','03','鍵状態');
insert into sys_codefieldsmst(sys_id,table_mng_no,table_field_no,table_field_name) values('SysId001','CT-KEIYAKU-002','04','鍵タイプ');
insert into sys_codefieldsmst(sys_id,table_mng_no,table_field_no,table_field_name) values('SysId001','CT-KEIYAKU-006','01','自社他社区分');
insert into sys_codefieldsmst(sys_id,table_mng_no,table_field_no,table_field_name) values('SysId001','CT-KEIYAKU-008','01','職種');
insert into sys_codefieldsmst(sys_id,table_mng_no,table_field_no,table_field_name) values('SysId001','CT-KEIYAKU-010','01','個人法人区分');
insert into sys_codefieldsmst(sys_id,table_mng_no,table_field_no,table_field_name) values('SysId001','CT-KEIYAKU-011','01','個人法人区分');
insert into sys_codefieldsmst(sys_id,table_mng_no,table_field_no,table_field_name) values('SysId001','CT-KEIYAKU-011','02','契約更新手数料対象');
insert into sys_codefieldsmst(sys_id,table_mng_no,table_field_no,table_field_name) values('SysId001','CT-KEIYAKU-019','01','入居者区分');
insert into sys_codefieldsmst(sys_id,table_mng_no,table_field_no,table_field_name) values('SysId001','CT-KEIYAKU-022','01','支払種類');
insert into sys_codefieldsmst(sys_id,table_mng_no,table_field_no,table_field_name) values('SysId001','CT-KEIYAKU-022','02','返金済フラグ');
insert into sys_codefieldsmst(sys_id,table_mng_no,table_field_no,table_field_name) values('SysId001','CT-KEIYAKU-022','03','通貨種類');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-001','01','1','一戸建て');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-001','01','2','マンション');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-001','01','3','駐車場');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-001','01','4','工場');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-001','03','0','自社');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-001','03','1','他社');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-001','02','1','賃貸中');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-001','02','2','空き');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-001','02','3','予約中');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-001','02','4','退室待');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-002','01','0','無');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-002','01','1','有');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-002','02','1','玄関');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-002','02','2','部屋');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-002','02','3','ゴミ出し');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-002','03','1','賃貸中');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-002','03','2','貸出中');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-002','03','3','在庫中');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-002','04','1','パスワード式');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-002','04','2','実体式');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-002','04','3','マスタ機ー');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-002','04','4','合鍵');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-006','01','0','自社');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-006','01','1','他社');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-008','01','1','会社員');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-008','01','2','学生');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-010','01','0','個人');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-010','01','1','法人');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-011','01','0','個人');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-011','01','1','法人');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-011','02','0','仲介');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-011','02','1','大家さん');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-019','01','1','契約者');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-019','01','2','会社員');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-019','01','3','同居者');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-022','01','1','WeChat');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-022','01','2','TAOBAO');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-022','01','3','PayPay');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-022','02','0','未');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-022','02','1','済');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-022','03','1','RMB');
insert into sys_codevaluemst(sys_id,table_mng_no,table_field_no,table_code_id,code_value) values('Sys001','CT-KEIYAKU-022','03','2','JPY');
select * from sys_codevaluemst order by table_mng_no,table_field_no,table_code_id;
select *  from sys_codefieldsmst order by table_mng_no,table_field_no;
select *  from sys_codetablemst order by table_mng_no;

select a.sys_id,a.table_code_id, a.code_value,a.table_mng_no,a.table_field_no,d.table_field_name,d.table_name from sys_codevaluemst a left join 
    (select b.*,c.table_field_no,table_field_name from sys_codetablemst b left join sys_codefieldsmst c
    on b.table_mng_no = c.table_mng_no ) d
on a.table_field_no = d.table_field_no and a.table_mng_no = d.table_mng_no
where a.table_mng_no ='CT-KEIYAKU-001';