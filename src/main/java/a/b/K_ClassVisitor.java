package a.b;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class K_ClassVisitor extends ClassVisitor{
    public K_ClassVisitor(ClassWriter writer) {
        super(Opcodes.ASM4, writer);
    }

    @Override 
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        if ((name.equals("hasItem") || name.equals("b")) && desc.equals("(Lnet/minecraft/item/Item;)Z")) {

            System.out.println("找到hasItem");
            MethodVisitor methodvisitor = super.visitMethod(access, name, desc, signature, exceptions);
            methodvisitor.visitCode();
            Label start = new Label();
            methodvisitor.visitLabel(start);
            
            methodvisitor.visitVarInsn(Opcodes.ALOAD, 0);
            methodvisitor.visitVarInsn(Opcodes.ALOAD, 1);
            methodvisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "a/b/F", "hasItem", "(Lnet/minecraft/entity/player/InventoryPlayer;Lnet/minecraft/item/Item;)Z", false);//(Ladb;)Z
            methodvisitor.visitInsn(Opcodes.IRETURN);

            Label end = new Label();
            methodvisitor.visitLabel(end);
            methodvisitor.visitLocalVariable("this", "Lnet/minecraft/entity/player/InventoryPlayer;"/*匹配参数 */, null, start, end, 0/*参数位置 */);
            methodvisitor.visitLocalVariable("this", "Lnet/minecraft/item/Item;"/*匹配参数 */, null, start, end, 0/*参数位置 */);
            methodvisitor.visitEnd();
            return null;
        }
        return super.visitMethod(access, name, desc, signature, exceptions);
    }
}
