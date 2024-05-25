package test.logintest.kakao;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@RequestMapping("/login/oauth2")
public class KakaoLogin(@RequestParam String code) {
    // 1. 인가 코드 받기

    // 2. 토큰 받기
    String accessToken = kakaoApi.getAccessToken(code);

    // 3. 사용자 정보 받기
    Map<String, Object> userInfo = kakaoApi.getUserInfo(accessToken);

    String email = (String)userInfo.get("email");
    String nickname = (String)userInfo.get("nickname");

    System.out.println("email = ")
}
