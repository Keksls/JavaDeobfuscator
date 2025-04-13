/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class By
extends GeneratedMessageV3
implements BB {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    int f;
    public static final int b = 2;
    int g;
    private byte h = (byte)-1;
    private static final By i = new By();
    @Deprecated
    public static final Parser<By> c = new Bz();

    By(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private By() {
        this.f = 1;
        this.g = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    By(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block11;
                        bl2 = true;
                        continue block11;
                    }
                    case 8: {
                        int n2 = codedInputStream.readEnum();
                        bj_0 bj_02 = bj_0.a(n2);
                        if (bj_02 == null) {
                            builder.mergeVarintField(1, n2);
                            continue block11;
                        }
                        this.e |= 1;
                        this.f = n2;
                        continue block11;
                    }
                    case 16: 
                }
                this.e |= 2;
                this.g = codedInputStream.readInt32();
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return AO.w;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AO.x.ensureFieldAccessorsInitialized(By.class, BA.class);
    }

    @Override
    public boolean b() {
        return (this.e & 1) == 1;
    }

    @Override
    public bj_0 c() {
        bj_0 bj_02 = bj_0.a(this.f);
        return bj_02 == null ? bj_0.a : bj_02;
    }

    @Override
    public boolean d() {
        return (this.e & 2) == 2;
    }

    @Override
    public int e() {
        return this.g;
    }

    public final boolean isInitialized() {
        byte by = this.h;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.e & 1) == 1) {
            codedOutputStream.writeEnum(1, this.f);
        }
        if ((this.e & 2) == 2) {
            codedOutputStream.writeInt32(2, this.g);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.e & 1) == 1) {
            n += CodedOutputStream.computeEnumSize((int)1, (int)this.f);
        }
        if ((this.e & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.g);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof By)) {
            return super.equals(object);
        }
        By by = (By)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == by.b();
        if (this.b()) {
            bl = bl && this.f == by.f;
        }
        boolean bl3 = bl = bl && this.d() == by.d();
        if (this.d()) {
            bl = bl && this.e() == by.e();
        }
        bl = bl && this.unknownFields.equals((Object)by.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + By.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.f;
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static By a(ByteBuffer byteBuffer) {
        return (By)c.parseFrom(byteBuffer);
    }

    public static By a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (By)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static By a(ByteString byteString) {
        return (By)c.parseFrom(byteString);
    }

    public static By a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (By)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static By a(byte[] byArray) {
        return (By)c.parseFrom(byArray);
    }

    public static By a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (By)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static By a(InputStream inputStream) {
        return (By)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static By a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (By)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static By b(InputStream inputStream) {
        return (By)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static By b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (By)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static By a(CodedInputStream codedInputStream) {
        return (By)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static By a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (By)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public BA f() {
        return By.g();
    }

    public static BA g() {
        return i.h();
    }

    public static BA a(By by) {
        return i.h().a(by);
    }

    public BA h() {
        return this == i ? new BA() : new BA().a(this);
    }

    protected BA a(GeneratedMessageV3.BuilderParent builderParent) {
        BA bA = new BA(builderParent);
        return bA;
    }

    public static By i() {
        return i;
    }

    public static Parser<By> j() {
        return c;
    }

    public Parser<By> getParserForType() {
        return c;
    }

    public By k() {
        return i;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.h();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.f();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.k();
    }

    static /* synthetic */ boolean l() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(By by) {
        return by.unknownFields;
    }
}

