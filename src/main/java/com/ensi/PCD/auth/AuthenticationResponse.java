package com.ensi.PCD.auth;

import com.ensi.PCD.model.Role;
import com.ensi.PCD.model.RoleVendeur;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {

  private String token;
  private RoleVendeur role;
}
