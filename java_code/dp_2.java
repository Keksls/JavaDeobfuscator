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
 *  com.google.protobuf.Internal
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
import com.google.protobuf.Internal;
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
 * Renamed from dp
 */
public final class dp_2
extends GeneratedMessageV3
implements dh_1 {
    private static final long e = 0L;
    int f;
    public static final int a = 1;
    long g;
    public static final int b = 2;
    ds_2 h;
    public static final int c = 3;
    List<dr_1> i;
    private byte j = (byte)-1;
    private static final dp_2 k = new dp_2();
    @Deprecated
    public static final Parser<dp_2> d = new dq_1();

    dp_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private dp_2() {
        this.g = 0L;
        this.i = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    dp_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block12: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block12;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block12;
                        bl = true;
                        continue block12;
                    }
                    case 8: {
                        this.f |= 1;
                        this.g = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 18: {
                        du_1 du_12 = null;
                        if ((this.f & 2) == 2) {
                            du_12 = this.h.l();
                        }
                        this.h = (ds_2)codedInputStream.readMessage(ds_2.e, extensionRegistryLite);
                        if (du_12 != null) {
                            du_12.a(this.h);
                            this.h = du_12.m();
                        }
                        this.f |= 2;
                        continue block12;
                    }
                    case 26: 
                }
                if ((n & 4) != 4) {
                    this.i = new ArrayList<dr_1>();
                    n |= 4;
                }
                this.i.add((dr_1)codedInputStream.readMessage(dr_1.b, extensionRegistryLite));
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 4) == 4) {
                this.i = Collections.unmodifiableList(this.i);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return dn_1.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return dn_1.f.ensureFieldAccessorsInitialized(dp_2.class, dr_2.class);
    }

    @Override
    public boolean b() {
        return (this.f & 1) == 1;
    }

    @Override
    public long c() {
        return this.g;
    }

    @Override
    public boolean d() {
        return (this.f & 2) == 2;
    }

    @Override
    public ds_2 e() {
        return this.h == null ? ds_2.m() : this.h;
    }

    @Override
    public dv_1 f() {
        return this.h == null ? ds_2.m() : this.h;
    }

    @Override
    public List<dr_1> g() {
        return this.i;
    }

    @Override
    public List<? extends du_2> h() {
        return this.i;
    }

    @Override
    public int i() {
        return this.i.size();
    }

    @Override
    public dr_1 a(int n) {
        return this.i.get(n);
    }

    @Override
    public du_2 b(int n) {
        return this.i.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.j;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.j = 0;
            return false;
        }
        if (!this.d()) {
            this.j = 0;
            return false;
        }
        for (int k = 0; k < this.i(); ++k) {
            if (this.a(k).isInitialized()) continue;
            this.j = 0;
            return false;
        }
        this.j = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.f & 1) == 1) {
            codedOutputStream.writeInt64(1, this.g);
        }
        if ((this.f & 2) == 2) {
            codedOutputStream.writeMessage(2, (MessageLite)this.e());
        }
        for (int k = 0; k < this.i.size(); ++k) {
            codedOutputStream.writeMessage(3, (MessageLite)this.i.get(k));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.f & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.g);
        }
        if ((this.f & 2) == 2) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.e());
        }
        for (int k = 0; k < this.i.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.i.get(k)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof dp_2)) {
            return super.equals(object);
        }
        dp_2 dp_22 = (dp_2)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == dp_22.b();
        if (this.b()) {
            bl = bl && this.c() == dp_22.c();
        }
        boolean bl3 = bl = bl && this.d() == dp_22.d();
        if (this.d()) {
            bl = bl && this.e().equals(dp_22.e());
        }
        bl = bl && this.g().equals(dp_22.g());
        bl = bl && this.unknownFields.equals((Object)dp_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + dp_2.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e().hashCode();
        }
        if (this.i() > 0) {
            n = 37 * n + 3;
            n = 53 * n + this.g().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static dp_2 a(ByteBuffer byteBuffer) {
        return (dp_2)d.parseFrom(byteBuffer);
    }

    public static dp_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (dp_2)d.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static dp_2 a(ByteString byteString) {
        return (dp_2)d.parseFrom(byteString);
    }

    public static dp_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (dp_2)d.parseFrom(byteString, extensionRegistryLite);
    }

    public static dp_2 a(byte[] byArray) {
        return (dp_2)d.parseFrom(byArray);
    }

    public static dp_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (dp_2)d.parseFrom(byArray, extensionRegistryLite);
    }

    public static dp_2 a(InputStream inputStream) {
        return (dp_2)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream);
    }

    public static dp_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dp_2)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dp_2 b(InputStream inputStream) {
        return (dp_2)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream);
    }

    public static dp_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dp_2)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dp_2 a(CodedInputStream codedInputStream) {
        return (dp_2)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream);
    }

    public static dp_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dp_2)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public dr_2 j() {
        return dp_2.k();
    }

    public static dr_2 k() {
        return k.l();
    }

    public static dr_2 a(dp_2 dp_22) {
        return k.l().a(dp_22);
    }

    public dr_2 l() {
        return this == k ? new dr_2() : new dr_2().a(this);
    }

    protected dr_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        dr_2 dr_22 = new dr_2(builderParent);
        return dr_22;
    }

    public static dp_2 m() {
        return k;
    }

    public static Parser<dp_2> n() {
        return d;
    }

    public Parser<dp_2> getParserForType() {
        return d;
    }

    public dp_2 o() {
        return k;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.l();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.j();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.o();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.o();
    }

    static /* synthetic */ boolean p() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean q() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(dp_2 dp_22) {
        return dp_22.unknownFields;
    }
}

