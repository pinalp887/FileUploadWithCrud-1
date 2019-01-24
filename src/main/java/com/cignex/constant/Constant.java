package com.cignex.constant;

public class Constant {
	
	public static final String UPLOAD_FILE_DIRECTORY="G:\\SprinBoot\\FileUploadWithCrud-1\\src\\main\\webapp\\WEB-INF\\upload\\";
	
	/*---------------------------request constants-----------------------------------*/
	public static final String HOME_REQUEST="/home";
	public static final String USER_CONTROLLER_REQUEST="/user";
	public static final String REGISTER_USER_REQUEST="/register";
	public static final String SAVE_USER_REQUEST="/save";
	public static final String GET_ALL_USER_REQUEST="/list";
	public static final String REDIRECT_USER_LIST_REQUEST="redirect:/user/list";
	public static final String UPDATE_USER_REQUEST="/update";
	public static final String DELETE_USER_REQUEST="/delete/{id}";
	
	/*---------------------------return jsp constants-----------------------------------*/
	public static final String HOME="home";
	public static final String REGISTER="register";
	public static final String ALL_USER_LIST="userList";
	public static final String UPDATE_USER="update";
	
	/*---------------------------database constants-----------------------------------*/
	public static final String USER_TABLE_NAME="user";
	
	/*---------------------------user table column constants-----------------------------------*/
	public static final String USER_ID="u_id";
	public static final String USER_FIRST_NAME="first_name";
	public static final String USER_LAST_NAME="last_name";
	public static final String USER_EMAIL="email";
	public static final String USER_ADDRESS="address";
	public static final String USER_MOBILE="mobile";
	public static final String USER_GENDER="gender";
	public static final String USER_PROFILE="profile";
	
}
