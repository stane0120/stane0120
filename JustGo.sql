﻿DROP TABLE MEMBER;

CREATE TABLE "MEMBER" (
	"MEMBER_NO"	        NUMBER	        NOT NULL,
	"MEMBER_EMAIL"	    VARCHAR2(100)	NOT NULL,
	"MEMBER_PW"	        VARCHAR2(100)	NOT NULL,
	"MEMBER_NICKNAME"	VARCHAR2(40)	NOT NULL,
	"MEMBER_CODE"	    CHAR(1)	DEFAULT 'N'	    NOT NULL,
	"PROFILE_IMG"	    VARCHAR2(300)	        NULL,	
	"ENROLL_DATE"	    DATE	DEFAULT SYSDATE NOT NULL,	 
	"DISABLE_DATE"	    DATE	NULL,	
	"DELETE_DATE"	    DATE	NULL,	
	"SET_AL_REPLY"	    CHAR(1)	DEFAULT 'Y'	    NOT NULL,	
	"SET_AL_LIKE"	    CHAR(1)	DEFAULT 'Y'	    NOT NULL	
);


COMMENT ON COLUMN "MEMBER"."MEMBER_NO"       IS '회원번호(SEQ_MEMBER_NO)';
COMMENT ON COLUMN "MEMBER"."MEMBER_EMAIL"    IS '이메일';
COMMENT ON COLUMN "MEMBER"."MEMBER_PW"	     IS '비밀번호';
COMMENT ON COLUMN "MEMBER"."MEMBER_NICKNAME" IS '닉네임';
COMMENT ON COLUMN "MEMBER"."MEMBER_CODE"     IS '계정분류';
COMMENT ON COLUMN "MEMBER"."PROFILE_IMG"     IS'프로필이미지';
COMMENT ON COLUMN "MEMBER"."ENROLL_DATE"     IS '가입일';
COMMENT ON COLUMN "MEMBER"."DISABLE_DATE"    IS '비활성화일';
COMMENT ON COLUMN "MEMBER"."DELETE_DATE"     IS '탈퇴일';
COMMENT ON COLUMN "MEMBER"."SET_AL_REPLY"    IS '게시글댓글알림(N:OFF, Y:ON)';
COMMENT ON COLUMN "MEMBER"."SET_AL_LIKE"     IS '게시글좋아요알림(N:OFF, Y:ON)';


DROP TABLE "BOARD";

CREATE TABLE "BOARD" (
	"BOARD_NO"	        NUMBER	                 NOT NULL,
	"BOARD_TITLE"	    VARCHAR2(100)	         NOT NULL,
	"BOARD_TEXT"	    CLOB	                 NOT NULL,
	"CREATE_DATE"	    DATE	DEFAULT SYSDATE  NOT NULL,
	"UPDATE_DATE"	    DATE	                 NULL,
	"READ_COUNT"	    NUMBER	DEFAULT 0        NOT NULL,
	"BOARD_DELETE"	    CHAR(1)	DEFAULT 'N'      NULL,
	"MEMBER_NO"	        NUMBER	                 NOT NULL,
	"TAG_NO"            NUMBER	                 NOT NULL,
	"BOARD_CODE"	    NUMBER	                 NOT NULL,
	"COUNTRY_NO"	    NUMBER	                 NOT NULL,
	"BOARD_THUMBNAIL"	VARCHAR2(1000)	         NULL	
);




COMMENT ON COLUMN "BOARD"."BOARD_NO"        IS '게시글번호((SEQ_BOARD_NO)';
COMMENT ON COLUMN "BOARD"."BOARD_TITLE"     IS '게시글제목';
COMMENT ON COLUMN "BOARD"."BOARD_TEXT"      IS '게시글내용';
COMMENT ON COLUMN "BOARD"."CREATE_DATE"     IS '게시글 작성일';
COMMENT ON COLUMN "BOARD"."UPDATE_DATE"     IS '게시글 수정일';
COMMENT ON COLUMN "BOARD"."READ_COUNT"      IS '조회수';
COMMENT ON COLUMN "BOARD"."BOARD_DELETE"    IS '삭제여부';
COMMENT ON COLUMN "BOARD"."MEMBER_NO"	    IS '작성자번호(SEQ_MEMBER_NO)';
COMMENT ON COLUMN "BOARD"."TAG_NO"          IS '태그번호(SEQ_TAG_NO)';
COMMENT ON COLUMN "BOARD"."BOARD_CODE"      IS '게시글번호((SEQ_BOARD_CODE)';
COMMENT ON COLUMN "BOARD"."COUNTRY_NO"      IS '국가번호((SEQ_COUNTRY_CODE)';
COMMENT ON COLUMN "BOARD"."BOARD_THUMBNAIL" IS '썸네일';


DROP TABLE "FEEDBACK";

CREATE TABLE "FEEDBACK" (
	"FEEDBACK_NO"	NUMBER	                NOT NULL,
	"MEMBER_NO"	    NUMBER	                NOT NULL,
	"FEEDBACK_TEXT"	CLOB	                NULL,
	"FEEDBACK_DATE"	DATE	DEFAULT SYSDATE NOT NULL,
	"ADMIN_NO"	    NUMBER	                NOT NULL,
	"ADMIN_TEXT"	CLOB	                NULL,
	"CONFIRM_FL"	CHAR(1)	DEFAULT 'N'     NOT NULL,
	"CONFIRM_DATE"	DATE	NULL	
);


COMMENT ON COLUMN "FEEDBACK"."FEEDBACK_NO"   IS '의견번호(SEQ_FEEDBACK_NO)';
COMMENT ON COLUMN "FEEDBACK"."MEMBER_NO"	 IS '회원번호(SEQ_MEMBER_NO)';
COMMENT ON COLUMN "FEEDBACK"."FEEDBACK_TEXT" IS '피드백내용';
COMMENT ON COLUMN "FEEDBACK"."FEEDBACK_DATE" IS '작성일';
COMMENT ON COLUMN "FEEDBACK"."ADMIN_NO"      IS '관리자번호(SEQ_MEMBER_NO)';
COMMENT ON COLUMN "FEEDBACK"."ADMIN_TEXT"    IS '관리자답변';
COMMENT ON COLUMN "FEEDBACK"."CONFIRM_FL"    IS 'N: 처리중, Y:처리완료';
COMMENT ON COLUMN "FEEDBACK"."CONFIRM_DATE"  IS '처리일';

DROP TABLE "ALARM";

CREATE TABLE "ALARM" (
	"ALARM_NO"	    NUMBER	                NOT NULL,
	"MEMBER_NO"	    NUMBER	                NOT NULL,
	"ALARM_CONTENT"	VARCHAR2(3000)	        NULL,
	"ALARM_DATE"    DATE	DEFAULT SYSDATE	NOT NULL,
	"ALARM_CHECK"	CHAR(1)	DEFAULT 'N'	    NOT NULL	
);


COMMENT ON COLUMN "ALARM"."ALARM_NO"      IS '의견번호(SEQ_ALARM_NO)';
COMMENT ON COLUMN "ALARM"."MEMBER_NO"	  IS '알림받는회원(SEQ_MEMBER_NO)';
COMMENT ON COLUMN "ALARM"."ALARM_CONTENT" IS '알림내용';
COMMENT ON COLUMN "ALARM"."ALARM_DATE"    IS '알림발생날';
COMMENT ON COLUMN "ALARM"."ALARM_CHECK"   IS '알림확인여부(N: 확인 전, Y: 확인 후)';


DROP TABLE "BOARD_IMG";

CREATE TABLE "BOARD_IMG" (
	"IMG_NO"	    NUMBER	        NOT NULL,
	"IMG_PATH"	    VARCHAR2(300)	NOT NULL,
	"IMG_RENAME"	VARCHAR2(300)	NOT NULL,
	"IMG_ORIGIN"	VARCHAR2(300)	NOT NULL,
	"IMG_ORDER"	    NUMBER	        NOT NULL,
	"BOARD_NO"	    NUMBER	        NOT NULL	
);


COMMENT ON COLUMN "BOARD_IMG"."IMG_NO"      IS '이미지번호((SEQ_IMG_NO)';
COMMENT ON COLUMN "BOARD_IMG"."IMG_PATH"	IS '이미지경로';
COMMENT ON COLUMN "BOARD_IMG"."IMG_RENAME"  IS '변경된이름';
COMMENT ON COLUMN "BOARD_IMG"."IMG_ORIGIN"  IS '원본이름';
COMMENT ON COLUMN "BOARD_IMG"."IMG_ORDER"	IS '이미지순서';
COMMENT ON COLUMN "BOARD_IMG"."BOARD_NO"    IS '게시글번호((SEQ_BOARD_NO)';


DROP TABLE "CONTENT_LIKE";

CREATE TABLE "CONTENT_LIKE" (
	"BOARD_NO"	NUMBER	NOT NULL,
	"MEMBER_NO"	NUMBER	NOT NULL	
);

COMMENT ON COLUMN "CONTENT_LIKE"."BOARD_NO"  IS '게시글번호((SEQ_BOARD_NO)';
COMMENT ON COLUMN "CONTENT_LIKE"."MEMBER_NO" IS '회원번호(SEQ_MEMBER_NO)';

DROP TABLE "REPLY";

CREATE TABLE "REPLY" (
	"REPLY_NO"	        NUMBER	                    NOT NULL,
	"REPLY_CONTENT"	    VARCHAR2(3000)	            NOT NULL,
	"REPLY_DATE"        DATE	 DEFAULT SYSDATE    NOT NULL,
	"REPLY_UPDATE"	    DATE	                    NULL,
	"REPLY_DELETE"	    CHAR(1)	 DEFAULT 'N'        NULL,
	"MEMBER_NO"	        NUMBER	                    NOT NULL,
	"BOARD_NO"          NUMBER	                    NOT NULL,
	"PARENT_REPLY_NO"	NUMBER	                    NOT NULL	
);



COMMENT ON COLUMN "REPLY"."REPLY_NO"        IS '댓글번호(SEQ_REPLY_NO)';
COMMENT ON COLUMN "REPLY"."REPLY_CONTENT"   IS '댓글내용';
COMMENT ON COLUMN "REPLY"."REPLY_DATE"      IS '댓글작성일';
COMMENT ON COLUMN "REPLY"."REPLY_UPDATE"    IS '댓글수정';
COMMENT ON COLUMN "REPLY"."REPLY_DELETE"    IS '댓글삭제여부';
COMMENT ON COLUMN "REPLY"."MEMBER_NO"	   IS '회원번호(SEQ_MEMBER_NO)';
COMMENT ON COLUMN "REPLY"."BOARD_NO"        IS '게시글번호(SEQ_BOARD_NO)';
COMMENT ON COLUMN "REPLY"."PARENT_REPLY_NO" IS '댓글번호(SEQ_REPLY_NO)';



DROP TABLE "BOARD_TYPE";

CREATE TABLE "BOARD_TYPE" (
	"BOARD_CODE"	NUMBER	        NOT NULL,
	"BOARD_NAME"	VARCHAR2(100)	NOT NULL	
);

COMMENT ON COLUMN "BOARD_TYPE"."BOARD_CODE" IS '게시판이름';
COMMENT ON COLUMN "BOARD_TYPE"."BOARD_NAME" IS '게시글번호((SEQ_BOARD_CODE)';

DROP TABLE "AUTH_KEY";

CREATE TABLE "AUTH_KEY" (
	"AUTH_KEY_NO"	NUMBER	                       NOT NULL,
	"CODE"	        CHAR(6)	                       NOT NULL,
	"EMAIL"	        VARCHAR2(100)	               NOT NULL,
	"CREATE_TIME"	DATE	    DEFAULT SYSDATE    NOT NULL 
);

COMMENT ON COLUMN "AUTH_KEY"."AUTH_KEY_NO" IS '번호(SEQ_AUTH_KEY_NO)';
COMMENT ON COLUMN "AUTH_KEY"."CODE"        IS '코드';
COMMENT ON COLUMN "AUTH_KEY"."EMAIL"	   IS '이메일';
COMMENT ON COLUMN "AUTH_KEY"."CREATE_TIME" IS '인증시간';

DROP TABLE "REPORT";

CREATE TABLE "REPORT" (
	"REPORT_NO"	NUMBER	                     NOT NULL,
	"MEMBER_NO"	NUMBER	                     NOT NULL,
	"REPORT_CATEGORY"	NUMBER	             NOT NULL,
	"REPORT_DATE"	    DATE DEFAULT SYSDATE NOT NULL,
	"ADMIN_NO"	        NUMBER	             NOT NULL,
	"CONFIRM_FL"	    CHAR(1)	DEFAULT 'N'	 NOT NULL,
	"CONFIRM_DATE"	    DATE	                 NULL,
	"BOARD_NO"	        NUMBER	             NOT NULL	
);



COMMENT ON COLUMN "REPORT"."REPORT_NO"      IS '신고번호(SEQ_REPORT_NO)';
COMMENT ON COLUMN "REPORT"."MEMBER_NO"      IS '회원번호(SEQ_MEMBER_NO)';
COMMENT ON COLUMN "REPORT"."REPORT_CATEGORY"IS '신고유형(1~5)';
COMMENT ON COLUMN "REPORT"."REPORT_DATE"    IS '신고접수일';
COMMENT ON COLUMN "REPORT"."ADMIN_NO"       IS '관리자(SEQ_MEMBER_NO)';
COMMENT ON COLUMN "REPORT"."CONFIRM_FL"     IS 'N: 처리중, Y:처리완료 R:반려 D:보류';
COMMENT ON COLUMN "REPORT"."CONFIRM_DATE"   IS '처리일';
COMMENT ON COLUMN "REPORT"."BOARD_NO"       IS '게시글번호((SEQ_BOARD_NO)';



DROP TABLE "Tag";


CREATE TABLE "Tag" (
	"TAG_NO"	    NUMBER	NOT NULL,
	"TAG_CONTECT"	VARCHAR(30)	NOT NULL	
);


COMMENT ON COLUMN "Tag"."TAG_NO"      IS '태그번호(SEQ_TAG_NO)';
COMMENT ON COLUMN "Tag"."TAG_CONTECT" IS '태그내용';


DROP TABLE "COUNTRY";

CREATE TABLE "COUNTRY" (
	"COUNTRY_NO"	NUMBER	        NOT NULL,	
	"COUNTRY_NAME"	VARCHAR2(50)	NOT NULL	
);

COMMENT ON COLUMN "COUNTRY"."COUNTRY_NO"  IS '국가번호((SEQ_COUNTRY_CODE)';
COMMENT ON COLUMN "COUNTRY"."COUNTRY_NAME"IS '국가명';






ALTER TABLE "MEMBER" ADD CONSTRAINT "PK_MEMBER" PRIMARY KEY (
	"MEMBER_NO"
);

ALTER TABLE "FEEDBACK" ADD CONSTRAINT "PK_FEEDBACK" PRIMARY KEY (
	"FEEDBACK_NO"
);

ALTER TABLE "ALARM" ADD CONSTRAINT "PK_ALARM" PRIMARY KEY (
	"ALARM_NO"
);

ALTER TABLE "BOARD_IMG" ADD CONSTRAINT "PK_BOARD_IMG" PRIMARY KEY (
	"IMG_NO"
);

ALTER TABLE "CONTENT_LIKE" ADD CONSTRAINT "PK_CONTENT_LIKE" PRIMARY KEY (
	"BOARD_NO",
	"MEMBER_NO"
);

ALTER TABLE "REPLY" ADD CONSTRAINT "PK_REPLY" PRIMARY KEY (
	"REPLY_NO"
);

ALTER TABLE "BOARD_TYPE" ADD CONSTRAINT "PK_BOARD_TYPE" PRIMARY KEY (
	"BOARD_CODE"
);

ALTER TABLE "AUTH_KEY" ADD CONSTRAINT "PK_AUTH_KEY" PRIMARY KEY (
	"AUTH_KEY_NO"
);

ALTER TABLE "REPORT" ADD CONSTRAINT PK_REPORT PRIMARY KEY (
	REPORT_NO
);

ALTER TABLE "Tag" ADD CONSTRAINT PK_TAG PRIMARY KEY (
	TAG_NO
);

ALTER TABLE "BOARD" ADD CONSTRAINT PK_BOARD PRIMARY KEY (
	BOARD_NO
);

ALTER TABLE "COUNTRY" ADD CONSTRAINT PK_COUNTRY PRIMARY KEY (
	COUNTRY_NO
);

ALTER TABLE "FEEDBACK" ADD CONSTRAINT FK_MEMBER_TO_FEEDBACK_1 FOREIGN KEY (
	MEMBER_NO
)
REFERENCES "MEMBER" (
	MEMBER_NO
);

ALTER TABLE "FEEDBACK" ADD CONSTRAINT FK_MEMBER_TO_FEEDBACK_2 FOREIGN KEY (
	ADMIN_NO
)
REFERENCES "MEMBER" (
	MEMBER_NO
);

ALTER TABLE "ALARM" ADD CONSTRAINT FK_MEMBER_TO_ALARM_1 FOREIGN KEY (
	MEMBER_NO
)
REFERENCES "MEMBER" (
	MEMBER_NO
);

ALTER TABLE "BOARD_IMG" ADD CONSTRAINT FK_BOARD_TO_BOARD_IMG_1 FOREIGN KEY (
	BOARD_NO
)
REFERENCES "BOARD" (
	BOARD_NO
);

ALTER TABLE "CONTENT_LIKE" ADD CONSTRAINT FK_BOARD_TO_CONTENT_LIKE_1 FOREIGN KEY (
	BOARD_NO
)
REFERENCES "BOARD" (
	BOARD_NO
);

ALTER TABLE "CONTENT_LIKE" ADD CONSTRAINT FK_MEMBER_TO_CONTENT_LIKE_1 FOREIGN KEY (
	MEMBER_NO
)
REFERENCES "MEMBER" (
	MEMBER_NO
);

ALTER TABLE "REPLY" ADD CONSTRAINT FK_MEMBER_TO_REPLY_1 FOREIGN KEY (
	MEMBER_NO
)
REFERENCES "MEMBER" (
	MEMBER_NO
);

ALTER TABLE "REPLY" ADD CONSTRAINT FK_BOARD_TO_REPLY_1 FOREIGN KEY (
	BOARD_NO
)
REFERENCES "BOARD" (
	BOARD_NO
);

ALTER TABLE "REPLY" ADD CONSTRAINT FK_REPLY_TO_REPLY_1 FOREIGN KEY (
	PARENT_REPLY_NO
)
REFERENCES "REPLY" (
	REPLY_NO
);

ALTER TABLE "REPORT" ADD CONSTRAINT FK_MEMBER_TO_REPORT_1 FOREIGN KEY (
	MEMBER_NO
)
REFERENCES "MEMBER" (
	MEMBER_NO
);

ALTER TABLE "REPORT" ADD CONSTRAINT FK_MEMBER_TO_REPORT_2 FOREIGN KEY (
	ADMIN_NO
)
REFERENCES "MEMBER" (
	MEMBER_NO
);

ALTER TABLE "REPORT" ADD CONSTRAINT FK_BOARD_TO_REPORT_1 FOREIGN KEY (
	BOARD_NO
)
REFERENCES "BOARD" (
	BOARD_NO
);

ALTER TABLE "BOARD" ADD CONSTRAINT FK_MEMBER_TO_BOARD_1 FOREIGN KEY (
	MEMBER_NO
)
REFERENCES "MEMBER" (
	MEMBER_NO
);

ALTER TABLE "BOARD" ADD CONSTRAINT FK_Tag_TO_BOARD_1 FOREIGN KEY (
	TAG_NO
)
REFERENCES "Tag" (
	TAG_NO
);

ALTER TABLE "BOARD" ADD CONSTRAINT FK_BOARD_TYPE_TO_BOARD_1 FOREIGN KEY (
	BOARD_CODE
)
REFERENCES "BOARD_TYPE" (
	BOARD_CODE
);

ALTER TABLE "BOARD" ADD CONSTRAINT FK_COUNTRY_TO_BOARD_1 FOREIGN KEY (
	COUNTRY_NO
)
REFERENCES "COUNTRY" (
	COUNTRY_NO
);

