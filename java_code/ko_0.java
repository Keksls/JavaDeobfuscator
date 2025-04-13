/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from ko
 */
public final class ko_0
extends GeneratedMessageV3.Builder<ko_0>
implements kx_0 {
    private int a;
    private List<kp_0> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<kp_0, kr_0, ks_0> c;
    private List<kt_0> d = Collections.emptyList();
    private RepeatedFieldBuilderV3<kt_0, kv_0, kw_0> e;

    public static final Descriptors.Descriptor a() {
        return kg.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kg.f.ensureFieldAccessorsInitialized(km_0.class, ko_0.class);
    }

    ko_0() {
        this.s();
    }

    ko_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.s();
    }

    private void s() {
        if (km_0.n()) {
            this.u();
            this.w();
        }
    }

    public ko_0 h() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        if (this.e == null) {
            this.d = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
        } else {
            this.e.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kg.e;
    }

    public km_0 i() {
        return km_0.k();
    }

    public km_0 j() {
        km_0 km_02 = this.k();
        if (!km_02.isInitialized()) {
            throw ko_0.newUninitializedMessageException((Message)km_02);
        }
        return km_02;
    }

    public km_0 k() {
        km_0 km_02 = new km_0(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            km_02.e = this.b;
        } else {
            km_02.e = this.c.build();
        }
        if (this.e == null) {
            if ((this.a & 2) == 2) {
                this.d = Collections.unmodifiableList(this.d);
                this.a &= 0xFFFFFFFD;
            }
            km_02.f = this.d;
        } else {
            km_02.f = this.e.build();
        }
        this.onBuilt();
        return km_02;
    }

    public ko_0 l() {
        return (ko_0)super.clone();
    }

    public ko_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ko_0)super.setField(fieldDescriptor, object);
    }

    public ko_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ko_0)super.clearField(fieldDescriptor);
    }

    public ko_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ko_0)super.clearOneof(oneofDescriptor);
    }

    public ko_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ko_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ko_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ko_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public ko_0 a(Message message) {
        if (message instanceof km_0) {
            return this.a((km_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ko_0 a(km_0 km_02) {
        if (km_02 == km_0.k()) {
            return this;
        }
        if (this.c == null) {
            if (!km_02.e.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = km_02.e;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.t();
                    this.b.addAll(km_02.e);
                }
                this.onChanged();
            }
        } else if (!km_02.e.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = km_02.e;
                this.a &= 0xFFFFFFFE;
                this.c = km_0.o() ? this.u() : null;
            } else {
                this.c.addAllMessages(km_02.e);
            }
        }
        if (this.e == null) {
            if (!km_02.f.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = km_02.f;
                    this.a &= 0xFFFFFFFD;
                } else {
                    this.v();
                    this.d.addAll(km_02.f);
                }
                this.onChanged();
            }
        } else if (!km_02.f.isEmpty()) {
            if (this.e.isEmpty()) {
                this.e.dispose();
                this.e = null;
                this.d = km_02.f;
                this.a &= 0xFFFFFFFD;
                this.e = km_0.p() ? this.w() : null;
            } else {
                this.e.addAllMessages(km_02.f);
            }
        }
        this.b(km_0.b(km_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        int n;
        for (n = 0; n < this.d(); ++n) {
            if (this.a(n).isInitialized()) continue;
            return false;
        }
        for (n = 0; n < this.g(); ++n) {
            if (this.c(n).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public ko_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        km_0 km_02 = null;
        try {
            km_02 = (km_0)km_0.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            km_02 = (km_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (km_02 != null) {
                this.a(km_02);
            }
        }
        return this;
    }

    private void t() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<kp_0>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<kp_0> b() {
        if (this.c == null) {
            return Collections.unmodifiableList(this.b);
        }
        return this.c.getMessageList();
    }

    @Override
    public int d() {
        if (this.c == null) {
            return this.b.size();
        }
        return this.c.getCount();
    }

    @Override
    public kp_0 a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (kp_0)this.c.getMessage(n);
    }

    public ko_0 a(int n, kp_0 kp_02) {
        if (this.c == null) {
            if (kp_02 == null) {
                throw new NullPointerException();
            }
            this.t();
            this.b.set(n, kp_02);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)kp_02);
        }
        return this;
    }

    public ko_0 a(int n, kr_0 kr_02) {
        if (this.c == null) {
            this.t();
            this.b.set(n, kr_02.n());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)kr_02.n());
        }
        return this;
    }

    public ko_0 a(kp_0 kp_02) {
        if (this.c == null) {
            if (kp_02 == null) {
                throw new NullPointerException();
            }
            this.t();
            this.b.add(kp_02);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)kp_02);
        }
        return this;
    }

    public ko_0 b(int n, kp_0 kp_02) {
        if (this.c == null) {
            if (kp_02 == null) {
                throw new NullPointerException();
            }
            this.t();
            this.b.add(n, kp_02);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)kp_02);
        }
        return this;
    }

    public ko_0 a(kr_0 kr_02) {
        if (this.c == null) {
            this.t();
            this.b.add(kr_02.n());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)kr_02.n());
        }
        return this;
    }

    public ko_0 b(int n, kr_0 kr_02) {
        if (this.c == null) {
            this.t();
            this.b.add(n, kr_02.n());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)kr_02.n());
        }
        return this;
    }

    public ko_0 a(Iterable<? extends kp_0> iterable) {
        if (this.c == null) {
            this.t();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public ko_0 m() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public ko_0 e(int n) {
        if (this.c == null) {
            this.t();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public kr_0 f(int n) {
        return (kr_0)this.u().getBuilder(n);
    }

    @Override
    public ks_0 b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (ks_0)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends ks_0> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public kr_0 n() {
        return (kr_0)this.u().addBuilder((AbstractMessage)kp_0.o());
    }

    public kr_0 g(int n) {
        return (kr_0)this.u().addBuilder(n, (AbstractMessage)kp_0.o());
    }

    public List<kr_0> o() {
        return this.u().getBuilderList();
    }

    private RepeatedFieldBuilderV3<kp_0, kr_0, ks_0> u() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    private void v() {
        if ((this.a & 2) != 2) {
            this.d = new ArrayList<kt_0>(this.d);
            this.a |= 2;
        }
    }

    @Override
    public List<kt_0> e() {
        if (this.e == null) {
            return Collections.unmodifiableList(this.d);
        }
        return this.e.getMessageList();
    }

    @Override
    public int g() {
        if (this.e == null) {
            return this.d.size();
        }
        return this.e.getCount();
    }

    @Override
    public kt_0 c(int n) {
        if (this.e == null) {
            return this.d.get(n);
        }
        return (kt_0)this.e.getMessage(n);
    }

    public ko_0 a(int n, kt_0 kt_02) {
        if (this.e == null) {
            if (kt_02 == null) {
                throw new NullPointerException();
            }
            this.v();
            this.d.set(n, kt_02);
            this.onChanged();
        } else {
            this.e.setMessage(n, (AbstractMessage)kt_02);
        }
        return this;
    }

    public ko_0 a(int n, kv_0 kv_02) {
        if (this.e == null) {
            this.v();
            this.d.set(n, kv_02.k());
            this.onChanged();
        } else {
            this.e.setMessage(n, (AbstractMessage)kv_02.k());
        }
        return this;
    }

    public ko_0 a(kt_0 kt_02) {
        if (this.e == null) {
            if (kt_02 == null) {
                throw new NullPointerException();
            }
            this.v();
            this.d.add(kt_02);
            this.onChanged();
        } else {
            this.e.addMessage((AbstractMessage)kt_02);
        }
        return this;
    }

    public ko_0 b(int n, kt_0 kt_02) {
        if (this.e == null) {
            if (kt_02 == null) {
                throw new NullPointerException();
            }
            this.v();
            this.d.add(n, kt_02);
            this.onChanged();
        } else {
            this.e.addMessage(n, (AbstractMessage)kt_02);
        }
        return this;
    }

    public ko_0 a(kv_0 kv_02) {
        if (this.e == null) {
            this.v();
            this.d.add(kv_02.k());
            this.onChanged();
        } else {
            this.e.addMessage((AbstractMessage)kv_02.k());
        }
        return this;
    }

    public ko_0 b(int n, kv_0 kv_02) {
        if (this.e == null) {
            this.v();
            this.d.add(n, kv_02.k());
            this.onChanged();
        } else {
            this.e.addMessage(n, (AbstractMessage)kv_02.k());
        }
        return this;
    }

    public ko_0 b(Iterable<? extends kt_0> iterable) {
        if (this.e == null) {
            this.v();
            AbstractMessageLite.Builder.addAll(iterable, this.d);
            this.onChanged();
        } else {
            this.e.addAllMessages(iterable);
        }
        return this;
    }

    public ko_0 p() {
        if (this.e == null) {
            this.d = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.e.clear();
        }
        return this;
    }

    public ko_0 h(int n) {
        if (this.e == null) {
            this.v();
            this.d.remove(n);
            this.onChanged();
        } else {
            this.e.remove(n);
        }
        return this;
    }

    public kv_0 i(int n) {
        return (kv_0)this.w().getBuilder(n);
    }

    @Override
    public kw_0 d(int n) {
        if (this.e == null) {
            return this.d.get(n);
        }
        return (kw_0)this.e.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends kw_0> f() {
        if (this.e != null) {
            return this.e.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.d);
    }

    public kv_0 q() {
        return (kv_0)this.w().addBuilder((AbstractMessage)kt_0.l());
    }

    public kv_0 j(int n) {
        return (kv_0)this.w().addBuilder(n, (AbstractMessage)kt_0.l());
    }

    public List<kv_0> r() {
        return this.w().getBuilderList();
    }

    private RepeatedFieldBuilderV3<kt_0, kv_0, kw_0> w() {
        if (this.e == null) {
            this.e = new RepeatedFieldBuilderV3(this.d, (this.a & 2) == 2, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.d = null;
        }
        return this.e;
    }

    public final ko_0 a(UnknownFieldSet unknownFieldSet) {
        return (ko_0)super.setUnknownFields(unknownFieldSet);
    }

    public final ko_0 b(UnknownFieldSet unknownFieldSet) {
        return (ko_0)super.mergeUnknownFields(unknownFieldSet);
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
        return this.h();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.l();
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
        return this.h();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.l();
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
        return this.l();
    }

    public /* synthetic */ Message buildPartial() {
        return this.k();
    }

    public /* synthetic */ Message build() {
        return this.j();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.l();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.k();
    }

    public /* synthetic */ MessageLite build() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.h();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.i();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.i();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.l();
    }

    public /* synthetic */ Object clone() {
        return this.l();
    }
}

