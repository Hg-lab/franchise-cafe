INSERT INTO product_category (id, name, display_Name, depth, parent_id)
VALUES
    (1, 'COFFEE', '커피', 1, NULL),
    (2, 'DECAF', '디카페인', 1, NULL),
    (3, 'BEVERAGE', '음료', 1, NULL),
    (4, 'TEA', '티', 1, NULL),
    (5, 'FOOD', '푸드', 1, NULL),
    (6, 'MERCHANDISE', '상품', 1, NULL);

INSERT INTO product_category (id, name, display_Name, depth, parent_id)
VALUES
    -- Coffee subcategories
    (7, 'ESPRESSO', '에스프레소', 2, 1),
    (8, 'LATTE', '라떼', 2, 1),
    (9, 'COLD_BREW', '콜드브루', 2, 1),
    -- Decaf subcategories
    (10, 'DECAF_ESPRESSO', '디카페인 에스프레소', 2, 2),
    (11, 'DECAF_LATTE', '디카페인 라떼', 2, 2),
    (12, 'DECAF_COLD_BREW', '디카페인 콜드브루', 2, 2),
    -- Beverage subcategories
    (13, 'ADE', '에이드', 2, 3),
    (14, 'FRAPPE', '프라페', 2, 3),
    (15, 'SMOOTHIE_JUICE', '스무디&주스', 2, 3),
    (16, 'NON_COFFEE_LATTE', '논-커피 라떼', 2, 3),
    -- Tea subcategories
    (17, 'TEA_PLEASURE', '티플레저', 2, 4),
    (18, 'CLASSIC', '클래식', 2, 4),
    -- Food subcategories
    (19, 'DESSERT', '디저트', 2, 5),
    (20, 'BAKERY', '베이커리', 2, 5),
    (21, 'CAKE', '케이크', 2, 5),
    -- Merchandise subcategories
    (22, 'GOODS', '굿즈', 2, 6),
    (23, 'HOME_CAFE', '홈카페', 2, 6),
    (24, 'BOTTLED_BEVERAGES', '병음료', 2, 6);

INSERT INTO product (id, name, display_name, description, category_id, is_Seasonal, is_Recommended, product_type, default_price)
VALUES
-- Espresso
(1, '앱)에스프레소', '에스프레소', '진한 에스프레소 한 잔', 7, false, true, 'MENU', 3000),
(2, '앱)아메리카노', '아메리카노', '에스프레소에 물을 섞은 깔끔한 커피', 7, false, false, 'MENU', 3500),
-- Latte
(3, '앱)바닐라 라떼', '바닐라 라떼', '달콤한 바닐라 시럽을 첨가한 라떼', 8, false, true, 'MENU', 4500),
(4, '앱)카페 라떼', '카페 라떼', '부드러운 우유와 에스프레소가 어우러진 음료', 8, false, false, 'MENU', 4000),
-- Cold Brew
(5, '앱)콜드브루 블랙', '콜드브루 블랙', '시원하고 깊은 맛의 콜드브루', 9, true, true, 'MENU', 4500),
(6, '앱)콜드브루 라떼', '콜드브루 라떼', '콜드브루에 부드러운 우유를 더한 음료', 9, true, false, 'MENU', 5000),
-- Decaf Espresso
(7, '앱)디카페인 에스프레소', '디카페인 에스프레소', '카페인이 없는 에스프레소', 10, false, false, 'MENU', 3200),
-- Ade
(8, '앱)레몬 에이드', '레몬 에이드', '상큼한 레몬 맛이 돋보이는 에이드', 13, true, true, 'MENU', 5500),
(9, '앱)청포도 에이드', '청포도 에이드', '달콤한 청포도가 들어간 에이드', 13, true, false, 'MENU', 5500),
-- Frappe
(10, '앱)카라멜 프라페', '카라멜 프라페', '카라멜 시럽이 들어간 시원한 프라페', 14, false, true, 'MENU', 6000),
-- Smoothie & Juice
(11, '앱)딸기 스무디', '딸기 스무디', '신선한 딸기를 사용한 스무디', 15, true, false, 'MENU', 5800),
(12, '앱)망고 주스', '망고 주스', '달콤한 망고를 갈아 만든 주스', 15, true, true, 'MENU', 5800),
-- Non-Coffee Latte
(13, '앱)초코 라떼', '초코 라떼', '진한 초콜릿 맛이 나는 라떼', 16, false, true, 'MENU', 4500),
-- Tea Pleasure
(14, '앱)얼그레이 티', '얼그레이 티', '상큼한 베르가못 향이 가미된 홍차', 17, false, false, 'MENU', 4000),
-- Classic Tea
(15, '앱)페퍼민트 티', '페퍼민트 티', '상쾌한 페퍼민트 향이 나는 허브티', 18, true, false, 'MENU', 4000),
-- Dessert
(16, '앱)티라미수 케이크', '티라미수 케이크', '부드럽고 진한 티라미수 케이크', 19, true, true, 'MENU', 7000),
-- Bakery
(17, '앱)크루아상', '크루아상', '겹겹이 쌓인 버터 풍미의 크루아상', 20, false, true, 'MENU', 3500),
-- Cake
(18, '앱)초코 케이크', '초코 케이크', '진한 초콜릿 맛이 나는 케이크', 21, true, false, 'MENU', 7000),
-- Goods
(19, '앱)텀블러', '텀블러', '스타일리시한 텀블러', 22, false, false, 'MENU', 15000),
-- Home Café
(20, '앱)홈카페 세트', '홈카페 세트', '집에서 즐길 수 있는 커피 세트', 23, true, true, 'MENU', 20000),
-- Bottled Beverages
(21, '앱)콜드브루 병음료', '콜드브루 병음료', '콜드브루를 병에 담은 음료', 24, true, true, 'MENU', 5500);
