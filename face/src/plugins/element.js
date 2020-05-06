import Vue from 'vue';
import {
  Container,
  Aside,
  Header,
  Main,
  Button,
  Loading,
  Card,
  Row,
  Col,
  Form,
  FormItem,
  Switch,
  Input,
  Menu,
  MenuItem,
  Submenu,
  MessageBox,
  Table,
  TableColumn,
  Dialog,
  Pagination,
  Breadcrumb,
  BreadcrumbItem,
  Tag,
  Select,
  Option,
  Upload,
  Message,
  DatePicker,
  Dropdown,
  DropdownMenu,
  DropdownItem,
} from 'element-ui';
import '@/styles/element-variables.scss';

Vue.use(Container);
Vue.use(Aside);
Vue.use(Header);
Vue.use(Main);
Vue.use(Button);
Vue.use(Card);
Vue.use(Row);
Vue.use(Col);
Vue.use(Form);
Vue.use(FormItem);
Vue.use(Switch);
Vue.use(Input);
Vue.use(Menu);
Vue.use(MenuItem);
Vue.use(Submenu);
Vue.use(Table);
Vue.use(TableColumn);
Vue.use(Dialog);
Vue.use(Pagination);
Vue.use(Breadcrumb);
Vue.use(BreadcrumbItem);
Vue.use(Tag);
Vue.use(Select);
Vue.use(Option);
Vue.use(Upload);
Vue.use(DatePicker);
Vue.use(Loading.directive);
Vue.use(Dropdown);
Vue.use(DropdownMenu);
Vue.use(DropdownItem);
Vue.prototype.$confirm = MessageBox.confirm;
Vue.prototype.$message = Message;
