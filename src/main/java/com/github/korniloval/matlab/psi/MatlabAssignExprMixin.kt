package com.github.korniloval.matlab.psi

import com.github.korniloval.matlab.psi.impl.MatlabBinaryExprImpl
import com.github.korniloval.matlab.psi.impl.MatlabRefExprImpl
import com.intellij.lang.ASTNode

/**
 * @author Liudmila Kornilova
 **/
abstract class MatlabAssignExprMixin(node: ASTNode) : MatlabBinaryExprImpl(node), MatlabDeclaration, MatlabAssignExpr {
    override fun getIdentifier(): MatlabRef? {
        return (left as? MatlabRefExprImpl)?.ref
    }

    override val implicit: Boolean = true
}
