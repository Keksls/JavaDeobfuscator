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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from gF
 */
public final class gf_1
extends GeneratedMessageV3
implements gm_1 {
    private static final long c = 0L;
    public static final int a = 1;
    List<gi_1> d;
    private byte e = (byte)-1;
    private static final gf_1 f = new gf_1();
    @Deprecated
    public static final Parser<gf_1> b = new gg_1();

    gf_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private gf_1() {
        this.d = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    gf_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block10: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block10;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block10;
                        bl2 = true;
                        continue block10;
                    }
                    case 10: 
                }
                if (!(bl & true)) {
                    this.d = new ArrayList<gi_1>();
                    bl |= true;
                }
                this.d.add((gi_1)codedInputStream.readMessage(gi_1.d, extensionRegistryLite));
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if (bl & true) {
                this.d = Collections.unmodifiableList(this.d);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return gd_0.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gd_0.b.ensureFieldAccessorsInitialized(gf_1.class, gh_1.class);
    }

    @Override
    public List<gi_1> b() {
        return this.d;
    }

    @Override
    public List<? extends gl_1> c() {
        return this.d;
    }

    @Override
    public int d() {
        return this.d.size();
    }

    @Override
    public gi_1 a(int n) {
        return this.d.get(n);
    }

    @Override
    public gl_1 b(int n) {
        return this.d.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.e;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            this.e = 0;
            return false;
        }
        this.e = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int k = 0; k < this.d.size(); ++k) {
            codedOutputStream.writeMessage(1, (MessageLite)this.d.get(k));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int k = 0; k < this.d.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.d.get(k)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof gf_1)) {
            return super.equals(object);
        }
        gf_1 gf_12 = (gf_1)object;
        boolean bl = true;
        bl = bl && this.b().equals(gf_12.b());
        bl = bl && this.unknownFields.equals((Object)gf_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + gf_1.a().hashCode();
        if (this.d() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static gf_1 a(ByteBuffer byteBuffer) {
        return (gf_1)b.parseFrom(byteBuffer);
    }

    public static gf_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (gf_1)b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static gf_1 a(ByteString byteString) {
        return (gf_1)b.parseFrom(byteString);
    }

    public static gf_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (gf_1)b.parseFrom(byteString, extensionRegistryLite);
    }

    public static gf_1 a(byte[] byArray) {
        return (gf_1)b.parseFrom(byArray);
    }

    public static gf_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (gf_1)b.parseFrom(byArray, extensionRegistryLite);
    }

    public static gf_1 a(InputStream inputStream) {
        return (gf_1)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream);
    }

    public static gf_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gf_1)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gf_1 b(InputStream inputStream) {
        return (gf_1)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream);
    }

    public static gf_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gf_1)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gf_1 a(CodedInputStream codedInputStream) {
        return (gf_1)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream);
    }

    public static gf_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gf_1)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public gh_1 e() {
        return gf_1.f();
    }

    public static gh_1 f() {
        return f.g();
    }

    public static gh_1 a(gf_1 gf_12) {
        return f.g().a(gf_12);
    }

    public gh_1 g() {
        return this == f ? new gh_1() : new gh_1().a(this);
    }

    protected gh_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        gh_1 gh_12 = new gh_1(builderParent);
        return gh_12;
    }

    public static gf_1 h() {
        return f;
    }

    public static Parser<gf_1> i() {
        return b;
    }

    public Parser<gf_1> getParserForType() {
        return b;
    }

    public gf_1 j() {
        return f;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.g();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.j();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.j();
    }

    static /* synthetic */ boolean k() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean l() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(gf_1 gf_12) {
        return gf_12.unknownFields;
    }
}

