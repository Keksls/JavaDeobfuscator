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
 *  com.google.protobuf.SingleFieldBuilderV3
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from dr
 */
public final class dr_2
extends GeneratedMessageV3.Builder<dr_2>
implements dh_1 {
    private int a;
    private long b;
    private ds_2 c = null;
    private SingleFieldBuilderV3<ds_2, du_1, dv_1> d;
    private List<dr_1> e = Collections.emptyList();
    private RepeatedFieldBuilderV3<dr_1, dt_2, du_2> f;

    public static final Descriptors.Descriptor a() {
        return dn_1.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return dn_1.f.ensureFieldAccessorsInitialized(dp_2.class, dr_2.class);
    }

    dr_2() {
        this.u();
    }

    dr_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.u();
    }

    private void u() {
        if (dp_2.p()) {
            this.v();
            this.x();
        }
    }

    public dr_2 j() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        if (this.d == null) {
            this.c = null;
        } else {
            this.d.clear();
        }
        this.a &= 0xFFFFFFFD;
        if (this.f == null) {
            this.e = Collections.emptyList();
            this.a &= 0xFFFFFFFB;
        } else {
            this.f.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return dn_1.e;
    }

    public dp_2 k() {
        return dp_2.m();
    }

    public dp_2 l() {
        dp_2 dp_22 = this.m();
        if (!dp_22.isInitialized()) {
            throw dr_2.newUninitializedMessageException((Message)dp_22);
        }
        return dp_22;
    }

    public dp_2 m() {
        dp_2 dp_22 = new dp_2(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        dp_22.g = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        dp_22.h = this.d == null ? this.c : (ds_2)this.d.build();
        if (this.f == null) {
            if ((this.a & 4) == 4) {
                this.e = Collections.unmodifiableList(this.e);
                this.a &= 0xFFFFFFFB;
            }
            dp_22.i = this.e;
        } else {
            dp_22.i = this.f.build();
        }
        dp_22.f = n2;
        this.onBuilt();
        return dp_22;
    }

    public dr_2 n() {
        return (dr_2)super.clone();
    }

    public dr_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dr_2)super.setField(fieldDescriptor, object);
    }

    public dr_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (dr_2)super.clearField(fieldDescriptor);
    }

    public dr_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (dr_2)super.clearOneof(oneofDescriptor);
    }

    public dr_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (dr_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public dr_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dr_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public dr_2 a(Message message) {
        if (message instanceof dp_2) {
            return this.a((dp_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public dr_2 a(dp_2 dp_22) {
        if (dp_22 == dp_2.m()) {
            return this;
        }
        if (dp_22.b()) {
            this.a(dp_22.c());
        }
        if (dp_22.d()) {
            this.b(dp_22.e());
        }
        if (this.f == null) {
            if (!dp_22.i.isEmpty()) {
                if (this.e.isEmpty()) {
                    this.e = dp_22.i;
                    this.a &= 0xFFFFFFFB;
                } else {
                    this.w();
                    this.e.addAll(dp_22.i);
                }
                this.onChanged();
            }
        } else if (!dp_22.i.isEmpty()) {
            if (this.f.isEmpty()) {
                this.f.dispose();
                this.f = null;
                this.e = dp_22.i;
                this.a &= 0xFFFFFFFB;
                this.f = dp_2.q() ? this.x() : null;
            } else {
                this.f.addAllMessages(dp_22.i);
            }
        }
        this.b(dp_2.b(dp_22));
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
        for (int k = 0; k < this.i(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public dr_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        dp_2 dp_22 = null;
        try {
            dp_22 = (dp_2)dp_2.d.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            dp_22 = (dp_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (dp_22 != null) {
                this.a(dp_22);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public long c() {
        return this.b;
    }

    public dr_2 a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public dr_2 o() {
        this.a &= 0xFFFFFFFE;
        this.b = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public ds_2 e() {
        if (this.d == null) {
            return this.c == null ? ds_2.m() : this.c;
        }
        return (ds_2)this.d.getMessage();
    }

    public dr_2 a(ds_2 ds_22) {
        if (this.d == null) {
            if (ds_22 == null) {
                throw new NullPointerException();
            }
            this.c = ds_22;
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)ds_22);
        }
        this.a |= 2;
        return this;
    }

    public dr_2 a(du_1 du_12) {
        if (this.d == null) {
            this.c = du_12.l();
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)du_12.l());
        }
        this.a |= 2;
        return this;
    }

    public dr_2 b(ds_2 ds_22) {
        if (this.d == null) {
            this.c = (this.a & 2) == 2 && this.c != null && this.c != ds_2.m() ? ds_2.a(this.c).a(ds_22).m() : ds_22;
            this.onChanged();
        } else {
            this.d.mergeFrom((AbstractMessage)ds_22);
        }
        this.a |= 2;
        return this;
    }

    public dr_2 p() {
        if (this.d == null) {
            this.c = null;
            this.onChanged();
        } else {
            this.d.clear();
        }
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public du_1 q() {
        this.a |= 2;
        this.onChanged();
        return (du_1)this.v().getBuilder();
    }

    @Override
    public dv_1 f() {
        if (this.d != null) {
            return (dv_1)this.d.getMessageOrBuilder();
        }
        return this.c == null ? ds_2.m() : this.c;
    }

    private SingleFieldBuilderV3<ds_2, du_1, dv_1> v() {
        if (this.d == null) {
            this.d = new SingleFieldBuilderV3((AbstractMessage)this.e(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    private void w() {
        if ((this.a & 4) != 4) {
            this.e = new ArrayList<dr_1>(this.e);
            this.a |= 4;
        }
    }

    @Override
    public List<dr_1> g() {
        if (this.f == null) {
            return Collections.unmodifiableList(this.e);
        }
        return this.f.getMessageList();
    }

    @Override
    public int i() {
        if (this.f == null) {
            return this.e.size();
        }
        return this.f.getCount();
    }

    @Override
    public dr_1 a(int n) {
        if (this.f == null) {
            return this.e.get(n);
        }
        return (dr_1)this.f.getMessage(n);
    }

    public dr_2 a(int n, dr_1 dr_12) {
        if (this.f == null) {
            if (dr_12 == null) {
                throw new NullPointerException();
            }
            this.w();
            this.e.set(n, dr_12);
            this.onChanged();
        } else {
            this.f.setMessage(n, (AbstractMessage)dr_12);
        }
        return this;
    }

    public dr_2 a(int n, dt_2 dt_22) {
        if (this.f == null) {
            this.w();
            this.e.set(n, dt_22.f());
            this.onChanged();
        } else {
            this.f.setMessage(n, (AbstractMessage)dt_22.f());
        }
        return this;
    }

    public dr_2 a(dr_1 dr_12) {
        if (this.f == null) {
            if (dr_12 == null) {
                throw new NullPointerException();
            }
            this.w();
            this.e.add(dr_12);
            this.onChanged();
        } else {
            this.f.addMessage((AbstractMessage)dr_12);
        }
        return this;
    }

    public dr_2 b(int n, dr_1 dr_12) {
        if (this.f == null) {
            if (dr_12 == null) {
                throw new NullPointerException();
            }
            this.w();
            this.e.add(n, dr_12);
            this.onChanged();
        } else {
            this.f.addMessage(n, (AbstractMessage)dr_12);
        }
        return this;
    }

    public dr_2 a(dt_2 dt_22) {
        if (this.f == null) {
            this.w();
            this.e.add(dt_22.f());
            this.onChanged();
        } else {
            this.f.addMessage((AbstractMessage)dt_22.f());
        }
        return this;
    }

    public dr_2 b(int n, dt_2 dt_22) {
        if (this.f == null) {
            this.w();
            this.e.add(n, dt_22.f());
            this.onChanged();
        } else {
            this.f.addMessage(n, (AbstractMessage)dt_22.f());
        }
        return this;
    }

    public dr_2 a(Iterable<? extends dr_1> iterable) {
        if (this.f == null) {
            this.w();
            AbstractMessageLite.Builder.addAll(iterable, this.e);
            this.onChanged();
        } else {
            this.f.addAllMessages(iterable);
        }
        return this;
    }

    public dr_2 r() {
        if (this.f == null) {
            this.e = Collections.emptyList();
            this.a &= 0xFFFFFFFB;
            this.onChanged();
        } else {
            this.f.clear();
        }
        return this;
    }

    public dr_2 c(int n) {
        if (this.f == null) {
            this.w();
            this.e.remove(n);
            this.onChanged();
        } else {
            this.f.remove(n);
        }
        return this;
    }

    public dt_2 d(int n) {
        return (dt_2)this.x().getBuilder(n);
    }

    @Override
    public du_2 b(int n) {
        if (this.f == null) {
            return this.e.get(n);
        }
        return (du_2)this.f.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends du_2> h() {
        if (this.f != null) {
            return this.f.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.e);
    }

    public dt_2 s() {
        return (dt_2)this.x().addBuilder((AbstractMessage)dr_1.g());
    }

    public dt_2 e(int n) {
        return (dt_2)this.x().addBuilder(n, (AbstractMessage)dr_1.g());
    }

    public List<dt_2> t() {
        return this.x().getBuilderList();
    }

    private RepeatedFieldBuilderV3<dr_1, dt_2, du_2> x() {
        if (this.f == null) {
            this.f = new RepeatedFieldBuilderV3(this.e, (this.a & 4) == 4, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.e = null;
        }
        return this.f;
    }

    public final dr_2 a(UnknownFieldSet unknownFieldSet) {
        return (dr_2)super.setUnknownFields(unknownFieldSet);
    }

    public final dr_2 b(UnknownFieldSet unknownFieldSet) {
        return (dr_2)super.mergeUnknownFields(unknownFieldSet);
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
        return this.j();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.n();
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
        return this.j();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.n();
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
        return this.n();
    }

    public /* synthetic */ Message buildPartial() {
        return this.m();
    }

    public /* synthetic */ Message build() {
        return this.l();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.n();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.m();
    }

    public /* synthetic */ MessageLite build() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.j();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.n();
    }

    public /* synthetic */ Object clone() {
        return this.n();
    }
}

