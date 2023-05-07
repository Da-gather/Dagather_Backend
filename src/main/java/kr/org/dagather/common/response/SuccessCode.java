package kr.org.dagather.common.response;

import static org.springframework.http.HttpStatus.*;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SuccessCode {

	/* 200 OK */
	GET_SUCCESS(OK, "조회 성공"),

	// 인증
	SIGNUP_SUCCESS(OK, "회원가입 성공"),
	LOGIN_SUCCESS(OK, "로그인 성공"),
	LOGOUT_SUCCESS(OK, "로그아웃 성공"),
	ACCOUNT_READ_SUCCESS(OK, "계정 조회 성공"),
	TOKEN_REISSUE_SUCCESS(OK, "토큰 재발급 성공"),

	// 게시판
	BOARD_POST_SUCCESS(CREATED, "글 작성 성공"),
	ARTICLE_DELETE_SUCCESS(OK, "게시물 삭제 성공"),
	COMMENT_DELETE_SUCCESS(OK, "댓글 삭제 성공"),

	/* 201 CREATED */
	COVERLETTER_CREATE_SUCCESS(CREATED, "자기소개서 생성 성공"),
	COMMENT_CREATE_SUCCESS(CREATED, "댓글 생성 성공"),
	ARTICLE_CREATE_SUCCESS(CREATED, "게시물 생성 성공"),
	PREQ_GET_SUCCESS(OK, "예상 면접 질문 조회 성공");

	private final HttpStatus status;
	private final String message;
}