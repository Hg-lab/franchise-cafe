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

-- Product category for SET menus
INSERT INTO product_category (id, name, display_Name, depth, parent_id)
VALUES
    (25, 'SET', '세트', 1, NULL),
    (26, 'SET', '세트', 1, 25);

-- Set menu products
INSERT INTO product (id, name, display_name, description, category_id, is_Seasonal, is_Recommended, product_type, default_price)
VALUES
    -- Set menus
    (22, '앱)브런치 세트', '브런치 세트', '아메리카노와 크루아상이 포함된 세트', 25, true, true, 'SET', 10000),
    (23, '앱)디저트 세트', '디저트 세트', '티라미수 케이크와 아메리카노가 포함된 세트', 25, true, true, 'SET', 12000),
    (24, '앱)콜드브루 세트', '콜드브루 세트', '콜드브루 블랙과 크루아상이 포함된 세트', 25, true, true, 'SET', 9500),
    (25, '앱)프라페 세트', '프라페 세트', '카라멜 프라페와 크루아상이 포함된 세트', 25, true, false, 'SET', 11000),
    (26, '앱)티 세트', '티 세트', '얼그레이 티와 크루아상이 포함된 세트', 25, false, true, 'SET', 9000);

-- Set menu 구성품 추가
INSERT INTO set_product_menu_product (set_product_id, menu_product_id)
VALUES
    -- 브런치 세트: 아메리카노와 크루아상
    (22, 2),  -- 아메리카노
    (22, 17), -- 크루아상
    -- 디저트 세트: 아메리카노와 티라미수 케이크
    (23, 2),  -- 아메리카노
    (23, 16), -- 티라미수 케이크
    -- 콜드브루 세트: 콜드브루 블랙과 크루아상
    (24, 5),  -- 콜드브루 블랙
    (24, 17), -- 크루아상
    -- 프라페 세트: 카라멜 프라페와 크루아상
    (25, 10), -- 카라멜 프라페
    (25, 17), -- 크루아상
    -- 티 세트: 얼그레이 티와 크루아상
    (26, 14), -- 얼그레이 티
    (26, 17); -- 크루아상


-- 옵션 데이터 (Option 테이블에 대한 데이터)
INSERT INTO options (id, name, display_name, is_required, is_multiple_choice)
VALUES
    (1, 'USE_PERSONAL_TUMBLER', '개인 텀블러 사용', true, false),
    (2, 'SHOT_SELECTION', '샷 선택', false, false),
    (3, 'SWEETNESS_LEVEL', '당도 선택', false, false),
    (4, 'TOPPING_SELECTION', '토핑 선택', false, true),
    (5, 'ADD_WHIPPING', '휘핑 추가', false, false),
    (6, 'CINNAMON_SELECTION', '시나몬 선택', false, false),
    (7, 'HEALTHY_OPTION', '건강 옵션 선택', false, true),
    (8, 'ADD_HONEY', '꿀 추가', false, false),
    (9, 'ADD_DECAF_SHOT', '디카페인 샷 추가', false, false);


-- ProductOption 데이터 (Product와 Option을 연결하는 데이터)
INSERT INTO product_option (id, product_id, option_id)
VALUES
    (1, 1, 1), (2, 1, 2), -- 에스프레소
    (3, 2, 1), (4, 2, 2), -- 아메리카노
    (5, 3, 1), (6, 3, 2), (7, 3, 3), (8, 3, 5), (9, 3, 4), -- 바닐라 라떼
    (10, 4, 1), (11, 4, 2), (12, 4, 3), (13, 4, 5), -- 카페 라떼
    (14, 5, 1), (15, 5, 7), (16, 5, 8), -- 콜드브루 블랙
    (17, 6, 1), (18, 6, 7), (19, 6, 8), (20, 6, 5), -- 콜드브루 라떼
    (21, 7, 1), (22, 7, 2), (23, 7, 9), -- 디카페인 에스프레소
    (24, 8, 1), (25, 8, 3), -- 레몬 에이드
    (26, 9, 1), (27, 9, 3), -- 청포도 에이드
    (28, 10, 1), (29, 10, 4), (30, 10, 5), -- 카라멜 프라페
    (31, 11, 1), (32, 11, 3), -- 딸기 스무디
    (33, 12, 1), (34, 12, 3), (35, 12, 7), -- 망고 주스
    (36, 13, 1), (37, 13, 2), (38, 13, 5), (39, 13, 4), (40, 13, 3), (41, 13, 9), -- 초코 라떼
    (42, 15, 1), (43, 15, 7); -- 페퍼민트 티
