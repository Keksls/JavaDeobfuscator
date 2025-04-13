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
 * Renamed from gf
 */
public final class gf_2
extends GeneratedMessageV3
implements gi_2 {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    int f;
    public static final int b = 2;
    List<dr_1> g;
    private byte h = (byte)-1;
    private static final gf_2 i = new gf_2();
    @Deprecated
    public static final Parser<gf_2> c = new gg_2();

    gf_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private gf_2() {
        this.f = 0;
        this.g = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    gf_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block11: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block11;
                        bl = true;
                        continue block11;
                    }
                    case 8: {
                        this.e |= 1;
                        this.f = codedInputStream.readInt32();
                        continue block11;
                    }
                    case 18: 
                }
                if ((n & 2) != 2) {
                    this.g = new ArrayList<dr_1>();
                    n |= 2;
                }
                this.g.add((dr_1)codedInputStream.readMessage(dr_1.b, extensionRegistryLite));
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 2) == 2) {
                this.g = Collections.unmodifiableList(this.g);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return gd_2.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gd_2.f.ensureFieldAccessorsInitialized(gf_2.class, gh_2.class);
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
    public List<dr_1> d() {
        return this.g;
    }

    @Override
    public List<? extends du_2> e() {
        return this.g;
    }

    @Override
    public int f() {
        return this.g.size();
    }

    @Override
    public dr_1 a(int n) {
        return this.g.get(n);
    }

    @Override
    public du_2 b(int n) {
        return this.g.get(n);
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
        for (int k = 0; k < this.f(); ++k) {
            if (this.a(k).isInitialized()) continue;
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.e & 1) == 1) {
            codedOutputStream.writeInt32(1, this.f);
        }
        for (int k = 0; k < this.g.size(); ++k) {
            codedOutputStream.writeMessage(2, (MessageLite)this.g.get(k));
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.f);
        }
        for (int k = 0; k < this.g.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.g.get(k)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof gf_2)) {
            return super.equals(object);
        }
        gf_2 gf_22 = (gf_2)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == gf_22.b();
        if (this.b()) {
            bl = bl && this.c() == gf_22.c();
        }
        bl = bl && this.d().equals(gf_22.d());
        bl = bl && this.unknownFields.equals((Object)gf_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + gf_2.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c();
        }
        if (this.f() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.d().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static gf_2 a(ByteBuffer byteBuffer) {
        return (gf_2)c.parseFrom(byteBuffer);
    }

    public static gf_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (gf_2)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static gf_2 a(ByteString byteString) {
        return (gf_2)c.parseFrom(byteString);
    }

    public static gf_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (gf_2)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static gf_2 a(byte[] byArray) {
        return (gf_2)c.parseFrom(byArray);
    }

    public static gf_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (gf_2)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static gf_2 a(InputStream inputStream) {
        return (gf_2)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static gf_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gf_2)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gf_2 b(InputStream inputStream) {
        return (gf_2)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static gf_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gf_2)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gf_2 a(CodedInputStream codedInputStream) {
        return (gf_2)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static gf_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gf_2)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public gh_2 g() {
        return gf_2.h();
    }

    public static gh_2 h() {
        return i.i();
    }

    public static gh_2 a(gf_2 gf_22) {
        return i.i().a(gf_22);
    }

    public gh_2 i() {
        return this == i ? new gh_2() : new gh_2().a(this);
    }

    protected gh_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        gh_2 gh_22 = new gh_2(builderParent);
        return gh_22;
    }

    public static gf_2 j() {
        return i;
    }

    public static Parser<gf_2> k() {
        return c;
    }

    public Parser<gf_2> getParserForType() {
        return c;
    }

    public gf_2 l() {
        return i;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.i();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.g();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.l();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.l();
    }

    static /* synthetic */ boolean m() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean n() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(gf_2 gf_22) {
        return gf_22.unknownFields;
    }
}

