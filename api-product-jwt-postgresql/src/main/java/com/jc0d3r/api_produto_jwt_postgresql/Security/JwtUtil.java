package com.jc0d3r.api_produto_jwt_postgresql.Security;

//public class JwtUtil {
//
//    private static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
//
//    private static final long EXPIRATION_TIME = 86400000;//24h
//
//    public static String generateToken(String username) {
//        return Jwts.builder()
//                .setSubject(username)
//                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
//                .signWith(key, SignatureAlgorithm.HS256)
//                .compact();
//    }
//
//    public static String extractUsername(String token) {
//        return Jwts.parserBuilder().setSigningKey(key).build()
//                .parsecCLaimsJws(token).getBody().getSubject();
//    }
//
//    public static boolean validadeToken(String token) {
//        try {
//            Jwts.parserBuilder().setSigningKey(key).build().parsecCLaimsJws(token);
//            return true;
//        } catch (JwtException e) {
//            return false;
//        }
//    }
//
//}
