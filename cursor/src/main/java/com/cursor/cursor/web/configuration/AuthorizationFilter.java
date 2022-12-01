package com.cursor.cursor.web.configuration;

import com.cursor.cursor.entity.User;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.http.HttpServletRequest;
import java.nio.file.attribute.UserPrincipal;

public class AuthorizationFilter extends BasicAuthenticationFilter {
    public AuthorizationFilter(AuthenticationManager authenticationManager) {
        super(authenticationManager);
    }

    public AuthorizationFilter(AuthenticationManager authenticationManager, AuthenticationEntryPoint authenticationEntryPoint) {
        super(authenticationManager, authenticationEntryPoint);
    }
//    UserRepository userRepository;
//
//    public AuthorizationFilter(AuthenticationManager authManager,
//                               UserRepository userRepository) {
//        super(authManager);
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest req,
//                                    HttpServletResponse res,
//                                    FilterChain chain) throws IOException, ServletException {
//
//        String header = req.getHeader(SecurityConstants.HEADER_STRING);
//
//        if (header == null || !header.startsWith(SecurityConstants.TOKEN_PREFIX)) {
//            chain.doFilter(req, res);
//            return;
//        }
//
//        UsernamePasswordAuthenticationToken authentication = getAuthentication(req);
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        chain.doFilter(req, res);
//    }
//
//    private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
//        String token = request.getHeader(SecurityConstants.HEADER_STRING);
//
//        if (token != null) {
//
//            token = token.replace(SecurityConstants.TOKEN_PREFIX, "");
//
//            String user = Jwts.parser()
//                    .setSigningKey( SecurityConstants.getTokenSecret() )
//                    .parseClaimsJws( token )
//                    .getBody()
//                    .getSubject();
//
//            if (user != null) {
//                User user = userRepository.findByEmail(user);
//                return new UsernamePasswordAuthenticationToken(user, null, new UserPrincipal(userEntity).getAuthorities());
//            }
//
//            return null;
//        }
//
//        return null;
//    }

}
