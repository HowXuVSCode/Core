package a.b;

import net.minecraft.launchwrapper.IClassTransformer;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

public class Transformer implements IClassTransformer {
    @Override
    public byte[] transform(String name, String transformedName, byte[] basicClass) {
        if (transformedName.equals("net.minecraft.entity.player.InventoryPlayer") || name.equals("yx")) {
            ClassReader reader = new ClassReader(basicClass);// 从ASM读入basicClass
            ClassWriter writer = new ClassWriter(reader, ClassWriter.COMPUTE_MAXS);// 自动计算堆栈大小
            K_ClassVisitor cvv = new K_ClassVisitor(writer);
            reader.accept(cvv, Opcodes.ASM4);
            return basicClass;// writer.toByteArray();// 返回Writer
        } else {
            return basicClass;
        }

    }
}