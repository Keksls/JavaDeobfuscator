/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from gR
 */
public final class gr_1
extends GeneratedMessageV3.Builder<gr_1>
implements gs_1 {
    private int a;
    private int b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private List<Long> h = Collections.emptyList();
    private int i;

    public static final Descriptors.Descriptor a() {
        return gn_1.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gn_1.b.ensureFieldAccessorsInitialized(gp_2.class, gr_1.class);
    }

    gr_1() {
        this.E();
    }

    gr_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.E();
    }

    private void E() {
        if (gp_2.x()) {
            // empty if block
        }
    }

    public gr_1 r() {
        super.clear();
        this.b = 0;
        this.a &= 0xFFFFFFFE;
        this.c = 0;
        this.a &= 0xFFFFFFFD;
        this.d = false;
        this.a &= 0xFFFFFFFB;
        this.e = false;
        this.a &= 0xFFFFFFF7;
        this.f = false;
        this.a &= 0xFFFFFFEF;
        this.g = false;
        this.a &= 0xFFFFFFDF;
        this.h = Collections.emptyList();
        this.a &= 0xFFFFFFBF;
        this.i = 0;
        this.a &= 0xFFFFFF7F;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return gn_1.a;
    }

    public gp_2 s() {
        return gp_2.u();
    }

    public gp_2 t() {
        gp_2 gp_22 = this.u();
        if (!gp_22.isInitialized()) {
            throw gr_1.newUninitializedMessageException((Message)gp_22);
        }
        return gp_22;
    }

    public gp_2 u() {
        gp_2 gp_22 = new gp_2(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        gp_22.l = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        gp_22.m = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        gp_22.n = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        gp_22.o = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        gp_22.p = this.f;
        if ((n & 0x20) == 32) {
            n2 |= 0x20;
        }
        gp_22.q = this.g;
        if ((this.a & 0x40) == 64) {
            this.h = Collections.unmodifiableList(this.h);
            this.a &= 0xFFFFFFBF;
        }
        gp_22.r = this.h;
        if ((n & 0x80) == 128) {
            n2 |= 0x40;
        }
        gp_22.s = this.i;
        gp_22.k = n2;
        this.onBuilt();
        return gp_22;
    }

    public gr_1 v() {
        return (gr_1)super.clone();
    }

    public gr_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gr_1)super.setField(fieldDescriptor, object);
    }

    public gr_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (gr_1)super.clearField(fieldDescriptor);
    }

    public gr_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (gr_1)super.clearOneof(oneofDescriptor);
    }

    public gr_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (gr_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public gr_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gr_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public gr_1 a(Message message) {
        if (message instanceof gp_2) {
            return this.a((gp_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public gr_1 a(gp_2 gp_22) {
        if (gp_22 == gp_2.u()) {
            return this;
        }
        if (gp_22.b()) {
            this.b(gp_22.c());
        }
        if (gp_22.d()) {
            this.c(gp_22.e());
        }
        if (gp_22.f()) {
            this.a(gp_22.g());
        }
        if (gp_22.h()) {
            this.b(gp_22.i());
        }
        if (gp_22.j()) {
            this.c(gp_22.k());
        }
        if (gp_22.l()) {
            this.d(gp_22.m());
        }
        if (!gp_22.r.isEmpty()) {
            if (this.h.isEmpty()) {
                this.h = gp_22.r;
                this.a &= 0xFFFFFFBF;
            } else {
                this.F();
                this.h.addAll(gp_22.r);
            }
            this.onChanged();
        }
        if (gp_22.p()) {
            this.d(gp_22.q());
        }
        this.b(gp_2.b(gp_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        if (!this.d()) {
            return false;
        }
        if (!this.f()) {
            return false;
        }
        if (!this.h()) {
            return false;
        }
        if (!this.j()) {
            return false;
        }
        if (!this.l()) {
            return false;
        }
        return this.p();
    }

    public gr_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        gp_2 gp_22 = null;
        try {
            gp_22 = (gp_2)gp_2.i.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            gp_22 = (gp_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (gp_22 != null) {
                this.a(gp_22);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public int c() {
        return this.b;
    }

    public gr_1 b(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public gr_1 w() {
        this.a &= 0xFFFFFFFE;
        this.b = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public int e() {
        return this.c;
    }

    public gr_1 c(int n) {
        this.a |= 2;
        this.c = n;
        this.onChanged();
        return this;
    }

    public gr_1 x() {
        this.a &= 0xFFFFFFFD;
        this.c = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean f() {
        return (this.a & 4) == 4;
    }

    @Override
    public boolean g() {
        return this.d;
    }

    public gr_1 a(boolean bl) {
        this.a |= 4;
        this.d = bl;
        this.onChanged();
        return this;
    }

    public gr_1 y() {
        this.a &= 0xFFFFFFFB;
        this.d = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean h() {
        return (this.a & 8) == 8;
    }

    @Override
    public boolean i() {
        return this.e;
    }

    public gr_1 b(boolean bl) {
        this.a |= 8;
        this.e = bl;
        this.onChanged();
        return this;
    }

    public gr_1 z() {
        this.a &= 0xFFFFFFF7;
        this.e = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean j() {
        return (this.a & 0x10) == 16;
    }

    @Override
    public boolean k() {
        return this.f;
    }

    public gr_1 c(boolean bl) {
        this.a |= 0x10;
        this.f = bl;
        this.onChanged();
        return this;
    }

    public gr_1 A() {
        this.a &= 0xFFFFFFEF;
        this.f = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean l() {
        return (this.a & 0x20) == 32;
    }

    @Override
    public boolean m() {
        return this.g;
    }

    public gr_1 d(boolean bl) {
        this.a |= 0x20;
        this.g = bl;
        this.onChanged();
        return this;
    }

    public gr_1 B() {
        this.a &= 0xFFFFFFDF;
        this.g = false;
        this.onChanged();
        return this;
    }

    private void F() {
        if ((this.a & 0x40) != 64) {
            this.h = new ArrayList<Long>(this.h);
            this.a |= 0x40;
        }
    }

    @Override
    public List<Long> n() {
        return Collections.unmodifiableList(this.h);
    }

    @Override
    public int o() {
        return this.h.size();
    }

    @Override
    public long a(int n) {
        return this.h.get(n);
    }

    public gr_1 a(int n, long l) {
        this.F();
        this.h.set(n, l);
        this.onChanged();
        return this;
    }

    public gr_1 a(long l) {
        this.F();
        this.h.add(l);
        this.onChanged();
        return this;
    }

    public gr_1 a(Iterable<? extends Long> iterable) {
        this.F();
        AbstractMessageLite.Builder.addAll(iterable, this.h);
        this.onChanged();
        return this;
    }

    public gr_1 C() {
        this.h = Collections.emptyList();
        this.a &= 0xFFFFFFBF;
        this.onChanged();
        return this;
    }

    @Override
    public boolean p() {
        return (this.a & 0x80) == 128;
    }

    @Override
    public int q() {
        return this.i;
    }

    public gr_1 d(int n) {
        this.a |= 0x80;
        this.i = n;
        this.onChanged();
        return this;
    }

    public gr_1 D() {
        this.a &= 0xFFFFFF7F;
        this.i = 0;
        this.onChanged();
        return this;
    }

    public final gr_1 a(UnknownFieldSet unknownFieldSet) {
        return (gr_1)super.setUnknownFields(unknownFieldSet);
    }

    public final gr_1 b(UnknownFieldSet unknownFieldSet) {
        return (gr_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.r();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.v();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.r();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.v();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.v();
    }

    public /* synthetic */ Message buildPartial() {
        return this.u();
    }

    public /* synthetic */ Message build() {
        return this.t();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.r();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.v();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.u();
    }

    public /* synthetic */ MessageLite build() {
        return this.t();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.r();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.s();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.s();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.v();
    }

    public /* synthetic */ Object clone() {
        return this.v();
    }
}

