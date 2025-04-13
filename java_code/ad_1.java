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
 * Renamed from aD
 */
public final class ad_1
extends GeneratedMessageV3
implements ai_1 {
    private static final long d = 0L;
    public static final int a = 1;
    int e;
    public static final int b = 2;
    int f;
    public static final int c = 3;
    av_2 g;
    private byte h = (byte)-1;
    private static final ad_1 i = new ad_1();
    static final Parser<ad_1> j = new ae_2();

    ad_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ad_1() {
        this.e = 0;
        this.f = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ad_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    default: {
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n)) continue block12;
                        bl2 = true;
                        continue block12;
                    }
                    case 8: {
                        this.e = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 16: {
                        int n2;
                        this.f = n2 = codedInputStream.readEnum();
                        continue block12;
                    }
                    case 26: 
                }
                ax_1 ax_12 = null;
                if (this.g != null) {
                    ax_12 = this.g.f();
                }
                this.g = (av_2)codedInputStream.readMessage(av_2.h(), extensionRegistryLite);
                if (ax_12 == null) continue;
                ax_12.a(this.g);
                this.g = ax_12.g();
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
        return ao_2.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ao_2.h.ensureFieldAccessorsInitialized(ad_1.class, af_1.class);
    }

    @Override
    public int b() {
        return this.e;
    }

    @Override
    public int c() {
        return this.f;
    }

    @Override
    public ag_1 d() {
        ag_1 ag_12 = ag_1.a(this.f);
        return ag_12 == null ? ag_1.g : ag_12;
    }

    @Override
    public boolean e() {
        return this.g != null;
    }

    @Override
    public av_2 f() {
        return this.g == null ? av_2.g() : this.g;
    }

    @Override
    public ay_2 g() {
        return this.f();
    }

    public final boolean isInitialized() {
        byte by = this.h;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.e != 0) {
            codedOutputStream.writeInt32(1, this.e);
        }
        if (this.f != ag_1.a.getNumber()) {
            codedOutputStream.writeEnum(2, this.f);
        }
        if (this.g != null) {
            codedOutputStream.writeMessage(3, (MessageLite)this.f());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.e != 0) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.e);
        }
        if (this.f != ag_1.a.getNumber()) {
            n += CodedOutputStream.computeEnumSize((int)2, (int)this.f);
        }
        if (this.g != null) {
            n += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.f());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ad_1)) {
            return super.equals(object);
        }
        ad_1 ad_12 = (ad_1)object;
        boolean bl = true;
        bl = bl && this.b() == ad_12.b();
        bl = bl && this.f == ad_12.f;
        boolean bl2 = bl = bl && this.e() == ad_12.e();
        if (this.e()) {
            bl = bl && this.f().equals(ad_12.f());
        }
        bl = bl && this.unknownFields.equals((Object)ad_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ad_1.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + this.b();
        n = 37 * n + 2;
        n = 53 * n + this.f;
        if (this.e()) {
            n = 37 * n + 3;
            n = 53 * n + this.f().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ad_1 a(ByteBuffer byteBuffer) {
        return (ad_1)j.parseFrom(byteBuffer);
    }

    public static ad_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ad_1)j.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ad_1 a(ByteString byteString) {
        return (ad_1)j.parseFrom(byteString);
    }

    public static ad_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ad_1)j.parseFrom(byteString, extensionRegistryLite);
    }

    public static ad_1 a(byte[] byArray) {
        return (ad_1)j.parseFrom(byArray);
    }

    public static ad_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ad_1)j.parseFrom(byArray, extensionRegistryLite);
    }

    public static ad_1 a(InputStream inputStream) {
        return (ad_1)GeneratedMessageV3.parseWithIOException(j, (InputStream)inputStream);
    }

    public static ad_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ad_1)GeneratedMessageV3.parseWithIOException(j, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ad_1 b(InputStream inputStream) {
        return (ad_1)GeneratedMessageV3.parseDelimitedWithIOException(j, (InputStream)inputStream);
    }

    public static ad_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ad_1)GeneratedMessageV3.parseDelimitedWithIOException(j, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ad_1 a(CodedInputStream codedInputStream) {
        return (ad_1)GeneratedMessageV3.parseWithIOException(j, (CodedInputStream)codedInputStream);
    }

    public static ad_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ad_1)GeneratedMessageV3.parseWithIOException(j, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public af_1 h() {
        return ad_1.i();
    }

    public static af_1 i() {
        return i.j();
    }

    public static af_1 a(ad_1 ad_12) {
        return i.j().a(ad_12);
    }

    public af_1 j() {
        return this == i ? new af_1() : new af_1().a(this);
    }

    protected af_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        af_1 af_12 = new af_1(builderParent);
        return af_12;
    }

    public static ad_1 k() {
        return i;
    }

    public static Parser<ad_1> l() {
        return j;
    }

    public Parser<ad_1> getParserForType() {
        return j;
    }

    public ad_1 m() {
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

    static /* synthetic */ UnknownFieldSet b(ad_1 ad_12) {
        return ad_12.unknownFields;
    }
}

