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

/*
 * Renamed from lN
 */
public final class ln_0
extends GeneratedMessageV3
implements lQ {
    private static final long d = 0L;
    int e;
    public static final int a = 20;
    int f;
    public static final int b = 21;
    int g;
    private byte h = (byte)-1;
    private static final ln_0 i = new ln_0();
    @Deprecated
    public static final Parser<ln_0> c = new lo_0();

    ln_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ln_0() {
        this.f = 0;
        this.g = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ln_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 160: {
                        this.e |= 1;
                        this.f = codedInputStream.readInt32();
                        continue block11;
                    }
                    case 168: 
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
        return kM.k;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kM.l.ensureFieldAccessorsInitialized(ln_0.class, lp_0.class);
    }

    @Override
    public boolean b() {
        return (this.e & 1) == 1;
    }

    @Override
    public int c() {
        return this.f;
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
        if (!this.d()) {
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.e & 1) == 1) {
            codedOutputStream.writeInt32(20, this.f);
        }
        if ((this.e & 2) == 2) {
            codedOutputStream.writeInt32(21, this.g);
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
            n += CodedOutputStream.computeInt32Size((int)20, (int)this.f);
        }
        if ((this.e & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)21, (int)this.g);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ln_0)) {
            return super.equals(object);
        }
        ln_0 ln_02 = (ln_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == ln_02.b();
        if (this.b()) {
            bl = bl && this.c() == ln_02.c();
        }
        boolean bl3 = bl = bl && this.d() == ln_02.d();
        if (this.d()) {
            bl = bl && this.e() == ln_02.e();
        }
        bl = bl && this.unknownFields.equals((Object)ln_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ln_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 20;
            n = 53 * n + this.c();
        }
        if (this.d()) {
            n = 37 * n + 21;
            n = 53 * n + this.e();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ln_0 a(ByteBuffer byteBuffer) {
        return (ln_0)c.parseFrom(byteBuffer);
    }

    public static ln_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ln_0)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ln_0 a(ByteString byteString) {
        return (ln_0)c.parseFrom(byteString);
    }

    public static ln_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ln_0)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static ln_0 a(byte[] byArray) {
        return (ln_0)c.parseFrom(byArray);
    }

    public static ln_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ln_0)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static ln_0 a(InputStream inputStream) {
        return (ln_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static ln_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ln_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ln_0 b(InputStream inputStream) {
        return (ln_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static ln_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ln_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ln_0 a(CodedInputStream codedInputStream) {
        return (ln_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static ln_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ln_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public lp_0 f() {
        return ln_0.g();
    }

    public static lp_0 g() {
        return i.h();
    }

    public static lp_0 a(ln_0 ln_02) {
        return i.h().a(ln_02);
    }

    public lp_0 h() {
        return this == i ? new lp_0() : new lp_0().a(this);
    }

    protected lp_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        lp_0 lp_02 = new lp_0(builderParent);
        return lp_02;
    }

    public static ln_0 i() {
        return i;
    }

    public static Parser<ln_0> j() {
        return c;
    }

    public Parser<ln_0> getParserForType() {
        return c;
    }

    public ln_0 k() {
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

    static /* synthetic */ UnknownFieldSet b(ln_0 ln_02) {
        return ln_02.unknownFields;
    }
}

