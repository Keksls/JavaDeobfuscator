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
 * Renamed from fZ
 */
public final class fz_2
extends GeneratedMessageV3
implements gc_1 {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    gj_2 f;
    public static final int b = 2;
    di_1 g;
    private byte h = (byte)-1;
    private static final fz_2 i = new fz_2();
    @Deprecated
    public static final Parser<fz_2> c = new ga_1();

    fz_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private fz_2() {
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    fz_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                GeneratedMessageV3.Builder builder2;
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
                    case 10: {
                        builder2 = null;
                        if ((this.e & 1) == 1) {
                            builder2 = this.f.j();
                        }
                        this.f = (gj_2)codedInputStream.readMessage(gj_2.c, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.a(this.f);
                            this.f = builder2.k();
                        }
                        this.e |= 1;
                        continue block11;
                    }
                    case 18: 
                }
                builder2 = null;
                if ((this.e & 2) == 2) {
                    builder2 = this.g.i();
                }
                this.g = (di_1)codedInputStream.readMessage(di_1.c, extensionRegistryLite);
                if (builder2 != null) {
                    builder2.a(this.g);
                    this.g = builder2.j();
                }
                this.e |= 2;
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
        return fx_2.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fx_2.b.ensureFieldAccessorsInitialized(fz_2.class, gb_1.class);
    }

    @Override
    public boolean b() {
        return (this.e & 1) == 1;
    }

    @Override
    public gj_2 c() {
        return this.f == null ? gj_2.k() : this.f;
    }

    @Override
    public gn_2 d() {
        return this.f == null ? gj_2.k() : this.f;
    }

    @Override
    public boolean e() {
        return (this.e & 2) == 2;
    }

    @Override
    public di_1 f() {
        return this.g == null ? di_1.j() : this.g;
    }

    @Override
    public dq_2 g() {
        return this.g == null ? di_1.j() : this.g;
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
        if (!this.c().isInitialized()) {
            this.h = 0;
            return false;
        }
        if (this.e() && !this.f().isInitialized()) {
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.e & 1) == 1) {
            codedOutputStream.writeMessage(1, (MessageLite)this.c());
        }
        if ((this.e & 2) == 2) {
            codedOutputStream.writeMessage(2, (MessageLite)this.f());
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
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.c());
        }
        if ((this.e & 2) == 2) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.f());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fz_2)) {
            return super.equals(object);
        }
        fz_2 fz_22 = (fz_2)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == fz_22.b();
        if (this.b()) {
            bl = bl && this.c().equals(fz_22.c());
        }
        boolean bl3 = bl = bl && this.e() == fz_22.e();
        if (this.e()) {
            bl = bl && this.f().equals(fz_22.f());
        }
        bl = bl && this.unknownFields.equals((Object)fz_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + fz_2.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c().hashCode();
        }
        if (this.e()) {
            n = 37 * n + 2;
            n = 53 * n + this.f().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static fz_2 a(ByteBuffer byteBuffer) {
        return (fz_2)c.parseFrom(byteBuffer);
    }

    public static fz_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (fz_2)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static fz_2 a(ByteString byteString) {
        return (fz_2)c.parseFrom(byteString);
    }

    public static fz_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (fz_2)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static fz_2 a(byte[] byArray) {
        return (fz_2)c.parseFrom(byArray);
    }

    public static fz_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (fz_2)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static fz_2 a(InputStream inputStream) {
        return (fz_2)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static fz_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fz_2)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fz_2 b(InputStream inputStream) {
        return (fz_2)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static fz_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fz_2)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fz_2 a(CodedInputStream codedInputStream) {
        return (fz_2)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static fz_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fz_2)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public gb_1 h() {
        return fz_2.i();
    }

    public static gb_1 i() {
        return i.j();
    }

    public static gb_1 a(fz_2 fz_22) {
        return i.j().a(fz_22);
    }

    public gb_1 j() {
        return this == i ? new gb_1() : new gb_1().a(this);
    }

    protected gb_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        gb_1 gb_12 = new gb_1(builderParent);
        return gb_12;
    }

    public static fz_2 k() {
        return i;
    }

    public static Parser<fz_2> l() {
        return c;
    }

    public Parser<fz_2> getParserForType() {
        return c;
    }

    public fz_2 m() {
        return i;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.j();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.h();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.m();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.m();
    }

    static /* synthetic */ boolean n() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(fz_2 fz_22) {
        return fz_22.unknownFields;
    }
}

