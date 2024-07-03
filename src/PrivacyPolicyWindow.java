import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrivacyPolicyWindow extends JFrame {

    private JTextArea policyText;
    private JCheckBox agreeCheckBox;
    private JButton continueButton;

    public PrivacyPolicyWindow() {

        setTitle("Політика конфіденційності JetBrains");
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);

        policyText = new JTextArea();
        policyText.setText("Політика конфіденційності JetBrains\n" +
                "Версія 2.8, останнє оновлення: 3 травня 2024 р\n" +
                "У цій Політиці конфіденційності ми описуємо типи даних, включно з Персональними даними (разом «дані»), які ми та наші асоційовані компанії збираємо від вас, коли ви використовуєте веб-сайти JetBrains і певні продукти та послуги JetBrains, як описано в цій Політиці конфіденційності ( у сукупності наші «послуги»), як ми та наші асоційовані компанії використовуємо та розкриваємо ці дані, а також ваші варіанти доступу або оновлення ваших даних.\n" +
                "\n" +
                "Ця Політика конфіденційності може час від часу змінюватися. Застосовується відповідна остання версія Політики конфіденційності на момент придбання або реєстрації Програмного продукту JetBrains (залежно від того, що станеться пізніше). Контролерами даних є JetBrains sro, Praha 4, Na Hřebenech II 1718/8, PSČ 140 00, Чеська Республіка та асоційовані компанії JetBrains .\n" +
                "\n" +
                "JetBrains та асоційовані з ним компанії діють як спільні контролери даних, які спільно відповідають за дотримання законодавства про захист даних. JetBrains sro несе основну відповідальність за реалізацію прав суб’єктів даних і надання інформації про обробку даних.\n" +
                "\n" +
                "визначення\n" +
                "У цій Політиці конфіденційності використовуються такі визначення:\n" +
                "\n" +
                "Програмний продукт JetBrains . Будь-який програмний продукт, що належить або створений JetBrains і надається згідно з Угодою про підписку JetBrains або іншою угодою JetBrains, ЗА ВИКЛЮЧЕННЯМ програмного забезпечення, яке може використовуватися програмними продуктами JetBrains, але не створене JetBrains. Це може включати, але не обмежуватися кодом, який розширює функціональність програмного продукту JetBrains (наприклад, «плагін»). Будь-який такий код регулюється власними умовами та політикою конфіденційності.\n" +
                "\n" +
                "Програмний продукт JetBrains, який можна завантажити . Будь-який програмний продукт JetBrains, який можна завантажити та встановити на пристрій.\n" +
                "\n" +
                "Програмне забезпечення JetBrains як послуга . Будь-який програмний продукт JetBrains, який пропонується як розміщене рішення, де програмне забезпечення встановлюється та підтримується JetBrains і надається вам як послуга.\n" +
                "\n" +
                "Веб-сайт JetBrains . Будь-який веб-сайт, який є власністю JetBrains sro («JetBrains», «ми»), включаючи, але не обмежуючись, усе, що розміщено в доменах, перелічених на https://www.jetbrains.com/legal/websites/ .\n" +
                "\n" +
                "Обліковий запис JetBrains . Обліковий запис, який ви створюєте і який JetBrains може використовувати для спілкування з вами або надання вам продуктів JetBrains, який містить ваше ім’я, прізвище, адресу електронної пошти, ім’я користувача та, якщо ви завантажуєте добровільно, вашу фотографію чи інший аватар. Доступ до вашого облікового запису здійснюється за допомогою імені користувача та пароля, і його можна використовувати для керування вашими особистими даними.\n" +
                "\n" +
                "Умови використання JetBrains означають Угоду про передплату JetBrains, Умови використання JetBrains для продукту чи послуги, Ліцензійну угоду JetBrains або інші угоди, які ви укладаєте з JetBrains щодо Продуктів або послуг JetBrains.\n" +
                "\n" +
                "Програмні продукти JetBrains, програмні продукти JetBrains, які можна завантажити, веб-сайт JetBrains і програмне забезпечення JetBrains як послуга можуть спільно іменуватися « продуктами JetBrains ».\n" +
                "\n" +
                "Персональні дані означають будь-які дані, що стосуються ідентифікованої або ідентифікованої фізичної особи.\n" +
                "\n" +
                "Усі інші терміни з великої літери, які використовуються в цій Політиці конфіденційності, мають таке саме значення, як визначено в статті 4 GDPR (такі як персональні дані, контролер, процесор, суб’єкт даних та інші), якщо інше не зазначено в цьому пункті визначення.\n" +
                "\n" +
                "Чому ми збираємо дані та що ми збираємо\n" +
                "Ми збираємо дані з різних причин, наприклад:\n" +
                "\n" +
                "a) Щоб надати вам програмне забезпечення, послуги або інформацію. Ми можемо збирати дані, включно з вашими Персональними даними, які необхідні для надання вам програмного забезпечення, підтримки та послуг, включаючи перевірку підтвердження та оновлень ліцензії, надання підтримки, звітування про проблеми та помилки та іншу обробку, пов’язану з використанням програмного забезпечення, послуг або інформації JetBrains. Ми можемо використовувати зібрані дані для розробки та тестування продуктів і послуг. Ви чітко заповнюєте Персональні дані, необхідні для отримання програмного забезпечення, підтримки чи послуг, незалежно від того, купуєте чи використовуєте продукти JetBrains, використовуєте наші форуми підтримки, реєструєте обліковий запис JetBrains, реєструєтеся на вебінар, берете участь в опитуванні, та/або підписатися на отримання маркетингової та/або технічної інформації та контенту, або ці дані збираються під час використання продуктів JetBrains. Ми можемо використовувати сторонніх постачальників послуг , які діють як обробники даних, щоб допомогти нам у наданні продуктів JetBrains вам або в нашій діяльності. Наприклад, ми можемо використовувати сторонніх постачальників послуг для надання послуг зберігання та резервного копіювання даних. З вашої згоди ваші Персональні дані також можуть бути передані стороннім постачальникам послуг , які діють як окремі контролери даних, які надають продукти та послуги, що доповнюють продукти JetBrains (подальша обробка даних, що виконується цими постачальниками послуг, регулюється їх політикою конфіденційності). Правовою основою такої обробки даних є виконання договору між вами та нами.\n" +
                "\n" +
                "b) Щоб захистити нас від піратства та незаконного використання нашого програмного забезпечення чи послуг . Ми можемо збирати дані, необхідні для захисту нас від будь-якого піратства, незаконного чи несанкціонованого використання нашого програмного забезпечення чи послуг, або які необхідні для забезпечення безпеки нашого програмного забезпечення чи послуг, включаючи персональні дані, надані вами (див. вище). і дані, зібрані під час використання продуктів JetBrains. Правовою основою для такої обробки даних є законний інтерес JetBrains щодо захисту від піратства та незаконного використання програмного забезпечення та послуг JetBrains.\n" +
                "\n" +
                "c) Щоб покращити наші пропозиції на основі використання. Ми можемо збирати дані на основі використання вами продуктів і послуг JetBrains, і ми не пов’язуємо ці дані з вашим іменем. Ми використовуємо ці дані, щоб краще зрозуміти моделі використання наших продуктів і поведінку нашої спільної аудиторії. Часом ми можемо надавати цю інформацію у зведеній анонімній формі третім особам. Збір даних на основі використання вами завантажуваних програмних продуктів JetBrains здійснюється лише з вашого дозволу. Правовою основою такої обробки даних є наш законний інтерес у вдосконаленні нашого програмного забезпечення та послуг.\n" +
                "\n" +
                "d) Для внутрішніх доказів JetBrains і для захисту прав та інтересів JetBrains та інших користувачів . Ми можемо збирати дані, необхідні для зберігання доказів надання вам програмного забезпечення та послуг, будь-якого зв’язку між вами та нами, ваших контактних даних, використання вами нашого програмного забезпечення та послуг, будь-яких платежів або відшкодувань, а також будь-яких питання або суперечки між вами та нами. Ми можемо використовувати та розголошувати ці дані, якщо ми вважаємо, на нашу власну думку, що це законно та доцільно робити це для захисту наших прав та інтересів, а також прав та інтересів інших користувачів продуктів або послуг JetBrains, або якщо ми вважаємо, що це було порушенням цієї Політики конфіденційності, що могло вплинути на інтереси JetBrains або її клієнтів. Правовою основою для такої обробки даних є наш законний інтерес у збереженні внутрішніх доказів і захист прав та інтересів нас та інших користувачів.\n" +
                "\n" +
                "e) Для просування та маркетингу наших продуктів і послуг. Ми можемо використовувати відгуки, які ви надаєте добровільно щодо наших продуктів або послуг. Як це дозволено чинним законодавством, ми можемо використовувати це у формі цитат або в інший спосіб відповідно до Умов використання JetBrains. Ми також можемо використовувати дані, які ми збираємо та об’єднуємо, щоб допомогти нам у визначенні належного маркетингу та реклами для наших продуктів і послуг. При цьому ми можемо ділитися анонімними зведеними даними з третім особам, щоб допомогти нам у цих зусиллях. З вашої згоди або якщо це дозволено чинним законодавством, ми також можемо використовувати ваші контактні дані, щоб надсилати вам комерційні повідомлення про наші продукти та послуги. Ми також можемо використовувати сторонніх постачальників послуг , щоб допомогти нам у нашому електронному маркетингу; у цьому випадку сторонній постачальник послуг матиме доступ до вашої електронної адреси, вашого імені та іншої інформації, необхідної для участі в маркетингу. Такий сторонній постачальник послуг діятиме як обробник даних і не використовуватиме ваші Персональні дані для будь-яких інших цілей. Правовою основою для такої обробки даних є наш законний інтерес у просуванні та маркетингу наших продуктів і послуг.\n" +
                "\n" +
                "f) Виконувати юридичні обов'язки, передбачені законодавством про бухгалтерський облік, оподаткування та іншими законами . Ми можемо використовувати та розкривати ваші Особисті дані, якщо цього вимагає закон, наприклад, для ведення та розкриття наших облікових записів, для ведення та розкриття нашої податкової звітності, а також у відповідь на ухвалу суду, дійсну повістку або інший судовий процес. Правовою основою для такої обробки даних є дотримання нами наших юридичних зобов’язань.\n" +
                "\n" +
                "Ви можете будь-коли заперечити проти обробки ваших Персональних даних для цілей b)–e).\n" +
                "\n" +
                "Категорії даних, які беруть участь в обробці даних, включають:\n" +
                "\n" +
                "імена,\n" +
                "адреса електронної пошти,\n" +
                "номер телефону,\n" +
                "ім'я користувача,\n" +
                "пароль,\n" +
                "фотографія (якщо надається добровільно),\n" +
                "печиво,\n" +
                "IP-адреса,\n" +
                "відкритий ключ SSH,\n" +
                "фізична адреса,\n" +
                "інформація про підписку та платежі,\n" +
                "ІПН,\n" +
                "дані про використання продуктів і послуг JetBrains,\n" +
                "коментарі, добровільно надані відгуки та будь-які дані, надані у відповідях на опитування,\n" +
                "дані у звітах про проблеми, що стосуються продуктів і послуг JetBrains.\n" +
                "За необхідності ми запропонуємо вам дати нам свою згоду на збір і обробку ваших даних, як описано вище. Це може статися в продуктах JetBrains, на веб-сайті JetBrains або в іншому середовищі, створеному JetBrains, завжди чітко та помітно. Ви можете керувати своїми особистими даними та відмовлятися, як описано в розділі «Прозорість» нижче.\n" +
                "\n" +
                "діти\n" +
                "Наші продукти та послуги не призначені для дітей віком до 13 років і не пропонуються їм. Якщо ми виявимо, що особа віком до 13 років надала інформацію безпосередньо нам, ми докладемо зусиль, щоб видалити цю інформацію з наших систем.\n" +
                "\n" +
                "Прозорість\n" +
                "Щоб поважати вашу конфіденційність, перед використанням ваших Персональних даних ми повідомимо вам про категорії Персональних даних, які ми збираємо, і цілі, для яких ми їх використовуємо. Ми також повідомимо вам про можливості керування даними, які у вас можуть бути. Для цього ми використовуємо угоди, умови використання та повідомлення про згоду, вбудовані в продукти та послуги JetBrains, які доступні тут . Якщо ви бажаєте отримати доступ до своїх даних і керувати ними, ви можете зробити це тут , ви можете оновлювати та керувати своїми Персональними даними, а також надати нам можливість відмовитися від збору певних Персональних даних.\n" +
                "\n" +
                "Обмін\n" +
                "Зібрані Персональні дані надаються на основі Угоди про підписку, Ліцензійної угоди, Умов використання продукту чи послуги, що використовуються, і цієї Політики конфіденційності. Крім того, ми ділимося зібраними Персональними даними в рамках описаної вище групи компаній JetBrains, які діють як спільні контролери даних і обробляють Персональні дані для цілей, описаних вище.\n" +
                "\n" +
                "Згідно з Умовами використання JetBrains, які стосуються певного продукту чи послуги, як частину функціональності продукту чи послуги, зібрані Персональні дані можуть бути передані іншим представникам вашої компанії.\n" +
                "\n" +
                "Ми можемо передавати ваші персональні дані певним третім сторонам , які допомагають нам надавати вам продукти чи послуги JetBrains або вести наш бізнес, наприклад, постачальникам послуг зберігання та резервного копіювання даних. Ми також можемо надати ваші персональні дані окремим представникам вашої компанії.\n" +
                "\n" +
                "Ваші персональні дані також можуть бути передані іншим організаціям або особам, якщо ми отримали вашу згоду на це.\n" +
                "\n" +
                "Ми також можемо передавати ваші Персональні дані певним третім сторонам, якщо ми зобов’язані робити це відповідно до чинного законодавства (особливо податковим органам або іншим державним органам, які виконують свої законні повноваження), або якщо такий обмін необхідний для досягнення цілей, визначених вище (особливо з державними органами або сторонами, які постраждали внаслідок порушення чинного законодавства).\n" +
                "\n" +
                "З метою дотримання вимог Каліфорнійського закону про конфіденційність споживачів (CCPA) ми цим повідомляємо вас, що JetBrains не буде: а) зберігати, використовувати, продавати чи іншим чином розкривати будь-які Персональні дані з будь-якою іншою метою, окрім надання Продуктів і послуг, зазначених у договір підписки; або b) зберігати, використовувати, продавати чи розкривати такі Персональні дані поза межами прямих відносин між Клієнтом і JetBrains; або c) використовувати Особисті дані інакше, ніж описано в (i) Політиці конфіденційності JetBrains, доступній за адресою https://www.jetbrains.com/legal/docs/privacy/privacy.html ; (ii) Угода користувача JetBrains, доступна за адресою https://www.jetbrains.com/legal/docs/toolbox/user.html ; (iii) Умови придбання JetBrains, доступні за адресою https://www.jetbrains.com/legal/docs/store/terms/ ; або (iv) будь-яка інша спеціальна угода, яку ви могли укласти з JetBrains.\n" +
                "\n" +
                "Служби YouTube API. Ми можемо відображати відео YouTube на веб-сайті JetBrains за допомогою клієнта API. Клієнт API використовує служби YouTube API ( посилання ). Взаємодіючи з відео, ви приймаєте Загальні положення та умови YouTube ( посилання ) і погоджуєтеся з Політикою конфіденційності Google ( посилання ). Взаємодіючи з веб-сайтом JetBrains, ви погоджуєтеся з нашою Політикою конфіденційності.\n" +
                "\n" +
                "Інформація, яку ми збираємо. Клієнт API збирає та використовує дані зі служб YouTube API. Він також збирає інформацію з ваших пристроїв, які ви використовуєте для доступу до веб-сайту JetBrains, у межах ваших налаштувань відстеження відповідно до нашого Повідомлення про файли cookie.\n" +
                "Як ми використовуємо вашу інформацію. Ми використовуємо дані, зібрані з клієнта API, щоб відображати відео YouTube через клієнт API. YouTube може отримати доступ до інформації про відео, які ви переглядали на веб-сайті JetBrains, і показувати рекламу на основі вашої історії переглядів. Налаштування реклами YouTube доступні за цим посиланням . Ми використовуємо власні та сторонні файли cookie, щоб покращити та персоналізувати ваш веб-сайт.\n" +
                "Обмін. Ми можемо надавати авторизовані дані Google ( включаючи YouTube ).\n" +
                "Ваші права. Ви можете керувати або скасовувати доступ Google до ваших даних за допомогою налаштувань безпеки Google.\n" +
                "Безпека\n" +
                "Щоб захистити ваші персональні дані, наші продукти та послуги розроблено з урахуванням безпеки та конфіденційності.\n" +
                "\n" +
                "Ми шифруємо ваші дані під час передачі та в спокої, де це технічно можливо. Зовнішні веб-ресурси захищені шифруванням SSL.\n" +
                "\n" +
                "Ми перевіряємо процеси використання персональних даних перед їх впровадженням. Це робиться для того, щоб мінімізувати використання даних і переконатися, що ви як власник даних поінформовані про обробку. Коли термін зберігання даних закінчується, ми видаляємо ваші Персональні дані з наших серверів або знеособлюємо їх для подальшого використання. За характером діяльності, у рамках якої збираються ваші дані, вони можуть відображатися в наборах даних, які використовуються для дослідження. Перш ніж використовувати набори даних для досліджень чи інших цілей, про які ви не поінформовані, ми видаляємо або анонімізуємо ваші Персональні дані в наборах даних.\n" +
                "\n" +
                "Ми використовуємо партнерів для розміщення наших послуг і веб-сайтів, а також для обробки ваших даних відповідно до цієї Політики конфіденційності. Вибираючи партнерів, ми перевіряємо їхню відповідність правовим нормам і стандартам безпеки, щоб переконатися, що ваші дані зберігаються в безпечному місці з відповідними заходами безпеки.\n" +
                "\n" +
                "Розташування вашої інформації\n" +
                "Будь-які сервери чи служби, які містять персональні дані, знаходяться в ЄС. Для продуктів програмного забезпечення як послуги ми надаємо нашим клієнтам можливість вибирати між розміщенням свого екземпляра в ЄС чи в інших регіонах . Часом JetBrains може обробляти або передавати деякі ваші персональні дані (наприклад, ім’я та адресу електронної пошти) нашим афілійованим компаніям за межами ЄС. Будь-яка така передача здійснюватиметься відповідно до чинного законодавства про захист даних і цієї Політики конфіденційності та ґрунтуватиметься на відповідному рішенні Європейської комісії щодо відповідності, особливо на стандартних положеннях про захист даних.\n" +
                "\n" +
                "Посилання третіх осіб\n" +
                "Веб-сайти JetBrains можуть містити посилання на інші веб-сайти, надані третіми сторонами, які не контролюються JetBrains. Переходячи за посиланням і надаючи інформацію сторонньому веб-сайту, майте на увазі, що JetBrains не несе відповідальності за дані, надані цій третій стороні. Ця Політика конфіденційності стосується лише веб-сайтів JetBrains, тому, коли ви відвідуєте інші веб-сайти, навіть якщо натискаєте посилання, опубліковане на веб-сайтах JetBrains, ви повинні прочитати їхню політику конфіденційності.\n" +
                "\n" +
                "Зберігання даних, відкликання схвалення, доступ до даних і ваші права\n" +
                "Якщо в будь-який момент ви вирішите припинити використання продуктів JetBrains, ви можете попросити видалити свої персональні дані з наших серверів, надіславши запит на адресу privacy@jetbrains.com або через свій обліковий запис JetBrains . Після видалення Персональних даних ми можемо зберегти псевдоніми ваших Персональних даних виключно для запису про видалення даних. Як правило, ми зберігаємо ваші персональні дані стільки, скільки потрібно для досягнення мети, для якої вони були зібрані. Ми можемо зберігати вашу інформацію, якщо це необхідно для дотримання юридичних зобов’язань та/або захисту у разі порушення Умов використання та/або Політики конфіденційності JetBrains. Ми також можемо мати копії вашої інформації в журналах додатків, веб-журналах та/або резервних копіях, створених з метою безпеки та підтримки, якщо це зазначено в Умовах використання JetBrains або тексті згоди, прийнятому до збору персональних даних. Ці резервні копії не будуть доступні як окрема окреслена інформація. Ми можемо зберігати Персональні дані, що стосуються клієнта або користувача, доки вони мають право на ліцензію або на використання Продуктів JetBrains. Крім того, ми можемо зберігати дані, щоб захистити себе від збитків у разі судового розгляду відповідно до чинного законодавства. Однак зауважте, що ви повинні зберегти копію всіх даних, які ви розмістили на наших серверах, у разі будь-якої втрати; крім того, якщо ви припините використовувати наше програмне забезпечення та/або послуги, ми не несемо відповідальності за збереження будь-яких ваших даних.\n" +
                "\n" +
                "Ви можете керувати своїми Персональними даними у своєму Обліковому записі JetBrains, включаючи відмову від збору певних видів даних. Ви несете відповідальність за правильність персональних даних, які ви нам надаєте. Ми очікуємо, що ви перевірите Персональні дані, які ви надаєте нам, і, якщо виникнуть будь-які невідповідності, оновіть свої Персональні дані або повідомте про невідповідність JetBrains.\n" +
                "\n" +
                "Відповідно до чинного законодавства, жителі ЄС можуть вимагати копію інформації, яку ми маємо про них. Для цього перейдіть до свого облікового запису JetBrains і попросіть копію доступними там засобами або напишіть на privacy@jetbrains.com . Відповідно до чинного законодавства ми можемо стягувати плату за цю послугу.\n" +
                "\n" +
                "Крім того, як зазначено в місцевому законодавстві про захист персональних даних, ви можете мати право: (i) вимагати доступу до ваших Персональних даних; (ii) вимагати виправлення ваших Персональних даних; (iii) вимагати видалення ваших Персональних даних; (iv) вимагати обмеження обробки ваших Персональних даних; (v) вимагати перенесення персональних даних; або (vi) заперечувати проти обробки ваших Персональних даних.\n" +
                "\n" +
                "Право доступу. Ви можете мати право отримати від нас підтвердження того, чи обробляються персональні дані, що стосуються вас, і, якщо це так, подати запит на доступ до ваших персональних даних. Інформація про обробку персональних даних включає цілі обробки, відповідні категорії персональних даних, одержувачів або категорії одержувачів, яким ваші персональні дані були або будуть розкриті тощо. Однак це не є абсолютним правом і інтереси інших осіб можуть обмежити ваше право доступу. Крім того, ви можете мати право отримати копію ваших персональних даних, які обробляються. За запит на додаткові копії ми можемо стягувати розумну плату на основі адміністративних витрат.\n" +
                "Право на виправлення. Ви можете мати право вимагати від нас виправлення неточних персональних даних. Залежно від цілей обробки ви можете мати право на доповнення неповних Персональних даних, зокрема шляхом надання додаткової заяви.\n" +
                "Право на стирання (право на забуття). За певних обставин ви можете мати право вимагати від нас видалення ваших персональних даних.\n" +
                "Право на обмеження обробки. За певних обставин ви можете мати право вимагати від нас обмеження обробки ваших персональних даних. У цьому випадку відповідні Персональні дані будуть позначені та можуть оброблятися нами лише для певних цілей.\n" +
                "Право на перенесення персональних даних. За певних обставин ви можете мати право отримати персональні дані, які вас стосуються, які ви надали нам, у структурованому, широко використовуваному та машинозчитуваному форматі, а також передавати ці персональні дані іншій організації.\n" +
                "Право на заперечення. За певних обставин ви можете мати право в будь-який час заперечити проти обробки нами ваших Персональних даних на підставах, пов’язаних з їхньою конкретною ситуацією, і ми можемо вимагати припинити обробку ваших Персональних даних.\n" +
                "Цими правами можна скористатися за адресою електронної пошти privacy@jetbrains.com .\n" +
                "\n" +
                "Ви також можете зв’язатися з JetBrains, щоб отримати актуальну інформацію про обробку ваших Персональних даних і будь-яких одержувачів Персональних даних.\n" +
                "\n" +
                "Ви можете подати скаргу, пов’язану з обробкою ваших персональних даних, до компетентного органу нагляду за захистом даних, тобто до Управління захисту персональних даних у Чеській Республіці з зареєстрованим офісом у Pplk. Sochora 727/27, 170 00 Praha 7- Holešovice, номер телефону: +420 234 665 111. Для отримання додаткової інформації відвідайте https://www.uoou.cz .\n" +
                "\n" +
                "Зміни до цієї Політики\n" +
                "Ця Політика конфіденційності діє на дату набрання чинності, зазначену вище. Ми можемо час від часу змінювати цю Політику конфіденційності, тому періодично перевіряйте її. Ми опублікуємо будь-які зміни в цій Політиці конфіденційності на веб-сайті JetBrains. Якщо ми вносимо будь-які зміни в цю Політику конфіденційності, які суттєво впливають на нашу практику щодо персональних даних, які ми раніше зібрали від вас, ми докладемо зусиль, щоб надати вам завчасне повідомлення про такі зміни, висвітливши цю зміну на веб-сайті JetBrains.\n" +
                "\n" +
                "Досягати\n" +
                "Якщо у вас виникли запитання чи занепокоєння, або ви вважаєте, що цю Політику конфіденційності було будь-яким чином порушено, негайно повідомте нам про це, надіславши адресу privacy@jetbrains.com .\n" +
                "\n");
        policyText.setLineWrap(true);
        policyText.setWrapStyleWord(true);
        policyText.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(policyText);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());

        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        agreeCheckBox = new JCheckBox("Я погоджуюсь.");
        checkBoxPanel.add(agreeCheckBox);

        continueButton = new JButton("Прийняти");
        continueButton.setEnabled(false);
        bottomPanel.add(checkBoxPanel, BorderLayout.WEST);
        bottomPanel.add(continueButton, BorderLayout.EAST);

        agreeCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isSelected = agreeCheckBox.isSelected();
                continueButton.setEnabled(isSelected);
            }
        });

        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        add(bottomPanel, BorderLayout.SOUTH);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(
                (screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);

        setVisible(true);
    }
}