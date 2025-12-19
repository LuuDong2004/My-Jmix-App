package com.dong.vn.app.security;

import com.dong.vn.app.entity.Mouse;
import io.jmix.rest.security.role.RestMinimalRole;
import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.security.role.annotation.SpecificPolicy;
import io.jmix.securityflowui.role.annotation.MenuPolicy;
import io.jmix.securityflowui.role.annotation.ViewPolicy;

@ResourceRole(name = "MouseManagementRole", code = MouseManagementRole.CODE, scope = "API")
public interface MouseManagementRole extends RestMinimalRole {
    String CODE = "mouse-management-role";

    @EntityAttributePolicy(entityClass = Mouse.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Mouse.class, actions = EntityPolicyAction.ALL)
    @ViewPolicy(viewIds = "*")
    @MenuPolicy(menuIds = "*")
    @SpecificPolicy(resources = "*")
    void mouse();
}